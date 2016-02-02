$url="http://ec2-54-165-55-56.compute-1.amazonaws.com/jenkins/job/farPoint/build"
$request = New-Object System.Net.WebClient
$auth = "Basic " + [System.Convert]::ToBase64String([System.Text.Encoding]::UTF8.GetBytes("user"+":"+"SfVzIkyAWnp7"))
$request.Headers.Add("AUTHORIZATION",$auth)
$request.Headers.Add("Accept", "application/json")
$request.Headers.Add("Content-Type","application/x-www-form-urlencoded")
$request.UploadString($url,"POST","")