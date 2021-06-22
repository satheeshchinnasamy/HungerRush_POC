$file= [IO.File]::ReadAllBytes("filepath\$Name.png")
$Base64file= [Convert]::ToBase64String($file)
echo $Base64file

$token = "PAT"

$url="https://dev.azure.com/HungerRush/Sandbox/_apis/test/Runs/$(runId)/results/$($TestResultID)/attachments?api-version=6.0-preview.1"

$token = [System.Convert]::ToBase64String([System.Text.Encoding]::ASCII.GetBytes(":$($token)"))

$JSON = "
    {
       `"stream`": `"$Base64file`",
       `"fileName`": `"$Name.png`",
       `"comment`": `"Test attachment upload`",
       `"attachmentType`": `"GeneralAttachment`"
    }"
$response = Invoke-RestMethod -Uri $url -Headers @{Authorization = "Basic $token"} -Method Post -Body $JSON -ContentType application/json