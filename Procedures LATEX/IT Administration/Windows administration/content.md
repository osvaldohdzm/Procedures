
sudo apt install python3-pip

## Introducción
Administración de sistemas windows


Add route to path powrshel
```

$newItem = "C:\Program Files (x86)\AnyDesk"
$old = (Get-ItemProperty -Path 'Registry::HKEY_LOCAL_MACHINE\System\CurrentControlSet\Control\Session Manager\Environment' -Name path).path
$new  =  "$old;$newItem"
Set-ItemProperty -Path 'Registry::HKEY_LOCAL_MACHINE\System\CurrentControlSet\Control\Session Manager\Environment' -Name path -Value $new
$env:Path = [System.Environment]::GetEnvironmentVariable("Path","Machine") + ";" + [System.Environment]::GetEnvironmentVariable("Path","User")
```


## Connect to Any desk from command line
echo 299792458.Light | anydesk 410112719 --with-password
Stop-Process -name "AnyDesk"

Configuración de entorno virtual paython


pip install virtualenv

After running the command, check if virtualenv is installed on your system. The following command displays the version of virtualenv if it is successfully installed on the system.

virtualenv –version

Once virtualenv is installed, we can use it to create virtual environments for our projects. Creating a virtual environment through virtualenv is quite easy. The following command serves the purpose.

virtualenv venv

Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))

choco install 7zip.install
choco uninstall python --pre 


choco install python 




Get-WindowsCapability -Online | Where-Object Name -like 'OpenSSH*'


Add-WindowsCapability -Online -Name OpenSSH.Server~~~~0.0.1.0

New-ItemProperty -Path "HKLM:\SOFTWARE\OpenSSH" -Name DefaultShell -Value "C:\Windows\System32\WindowsPowerShell\v1.0\powershell.exe" -PropertyType String -Force



 ssh cognitech01@192.168.100.10



Get-Process notepad, msedge

 Stop-Process -Name "notepad"


Get-MpComputerStatus
Get-MpComputerStatus | select RealTimeProtectionEnabled
Set-MpPreference -DisableRealtimeMonitoring $false


([Security.Principal.WindowsPrincipal] `
  [Security.Principal.WindowsIdentity]::GetCurrent() `
).IsInRole([Security.Principal.WindowsBuiltInRole]::Administrator)


Get-WmiObject -Class Win32_Product | Select-Object -Property Name


Get-WmiObject -Class Win32_Product | Select-Object -Property Name | Select-String "Visual"

regedit
Equipo\HKEY_CURRENT_USER\SOFTWARE\Microsoft\Office\16.0\PowerPoint\Options

ExportBitmapResolution
En 300

openssl enc -base64 -in .\evidencia.png -A | Set-Clipboard




Install ngrok

choco install ngrok

ngrok
set static ip
nvim


choco install neovim

After install revres path  with:
refreshenv

Kali Subsystem


Go yo recylbeble bin powershell
C:\$Recycle.Bin\


```

	sudo cat /etc/resolv.conf
```

 
```

sudo chattr -R -ia /etc/resolv.conf; sudo rm -rf /etc/resolv.conf && sudo touch /etc/resolv.conf && sudo chmod 777 /etc/resolv.conf  && sudo echo "nameserver 172.18.206.36" > /etc/resolv.conf && sudo echo "nameserver 172.18.206.37" >> /etc/resolv.conf && sudo echo "nameserver 8.8.8.8" >> /etc/resolv.conf && sudo echo "nameserver 8.8.4.4" >>  /etc/resolv.conf && sudo chattr +i /etc/resolv.conf
```


Disable WSL2 network by executing this:
Disable-NetAdapter -Name "vEthernet (WSL)"

Connect to VPN and then enable WSL2 network by executing this:
Enable-NetAdapter -Name "vEthernet (WSL)"
 
New-NetFirewallRule -DisplayName "WSL" -Direction Inbound  -InterfaceAlias "vEthernet (WSL)"  -Action Allow

Make chagnes permanten 
```

sudo bash -c 'echo "[network]" > /etc/wsl.conf' && sudo bash -c 'echo "generateResolvConf = false" >> /etc/wsl.conf'
```


And on powershjell Administración
```

	wsl.exe --shutdown
	wsl.exe
```




New-NetFirewallRule -DisplayName 'HTTP-Inbound' -Profile @('Domain', 'Private') -Direction Inbound -Action Allow -Protocol TCP -LocalPort @('80', '443', '8080')

New-NetFirewallRule -DisplayName "Allow inbound ICMPv4" -Direction Inbound -Protocol ICMPv4 -IcmpType 8 -RemoteAddress $ips -Action Allow

Start-Service -Name "SecoClientService"


set autoindent
gg=G

Borrar todo
ggVG

dir -Force

Delete line:
dd

Borrar todo:
ggVG

Reemplazar ent odo el texto:
:%s/MyApp/AppsMenu/g

Identar archivo
gg=G

Copy Line:
yy

Paste line:
p


:argadd ..\..\IT\ Administration\Windows\ administration\content.tex
:tab all


:tabnew ..\..\IT\ Administration\Windows\ administration\content.tex


### NVIM commands for long files
``
:set nowrap
``

``
pip install jsontool
``
``
:%!python -m json.tool --no-ensure-ascii
``

``
:%!python3 -m json.tool  --no-ensure-ascii
``


``
:syntax off 
``

this is not necesari owithoy sintax off
:set re=0


paste with 
*p
or
"*p

:syntax off :syntax on


type dirty.json | python -m json.tool > pretty.json


#### Change tab

gt


Set-ItemProperty -Path HKCU:Software\Microsoft\Windows\CurrentVersion\Themes\Personalize -Name EnableTransparency -Value 0 -Force
Set-ItemProperty -Path HKCU:Software\Microsoft\Windows\CurrentVersion\Themes\Personalize -Name EnableTransparency -Value 1 -Force

$env:Path = [System.Environment]::GetEnvironmentVariable("Path","Machine")



"defaults": 
        {
            "opacity": 20,
            "useAcrylic": true
        })



nvim
:set nowrap





:set nowrap
:%!python -m json.tool --no-ensure-ascii
:set re=0


paste with 
*p

:syntax off :syntax on


type dirty.json | python -m json.tool > pretty.json






 Sonar Queb
Administration
Configuration
Security
Projects
System
Marketplace




## EDGE


New-Item -Path HKCU:\Software\Policies\Microsoft\Edge -Name RestoreOnStartupURLs –Force
$path = 'HKCU:\Software\Policies\Microsoft\Edge\RestoreOnStartupURLs'
$name = '1'
$value = 'https://www.google.com.mx'
Set-Itemproperty -Path $path -Name $name -Value $value




Write-host "Trusting PS Gallery"
Set-PSRepository -Name 'PSGallery' -InstallationPolicy Trusted
Write-Host "Installing PolicyFileEditor V3"
Install-Module -Name PolicyFileEditor -RequiredVersion 3.0.0 -Scope CurrentUser
$UserDir = "$env:windir\system32\GroupPolicy\User\registry.pol"




MANAGE REGISTRY WINDOWS

# Get details
$registryPath = "HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion"
Get-ItemProperty -Path $registryPath -Name ProgramFilesDir

# Get one value
Get-ItemPropertyValue 'HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion' 'ProgramFilesDir'


Get-ItemPropertyValue 'HKCU:\Software\Policies\Microsoft\Edge\RestoreOnStartupURLs' '1'



Get-Item -Path 'Registry::HKCU\Software\Policies\Microsoft\Edge' | Select-Object -ExpandProperty Property


Set-ItemProperty -Path 'HKCU:\Software\Policies\Microsoft\Edge' -Name 'RestoreOnStartup' -Value 0x00000004


# SET EDGE STARTUP PAGE GOOGLE
Set-ItemProperty -Path 'HKCU:\Software\Policies\Microsoft\Edge' -Name 'RestoreOnStartup' -Value 0x00000004

$path = 'HKCU:\Software\Policies\Microsoft\Edge\RestoreOnStartupURLs'
$name = '1'
$value = 'https://www.google.com.mx'
Set-Itemproperty -Path $path -Name $name -Value $value

Set-ItemProperty -Path 'HKCU:\Software\Policies\Microsoft\Edge' -Name 'NewTabPageLocation' -Value 'https://www.google.com.mx'

Set-ItemProperty -Path 'HKCU:\Software\Policies\Microsoft\Edge' -Name 'DefaultSearchProviderSearchURL' -Value '{google:baseURL}search?q=%s&{google:RLZ}{google:originalQueryForSuggestion}{google:assistedQueryStats}{google:searchboxStats}{google:searchFieldtrialParameter}{google:iOSSearchLanguage}{google:prefetchSource}{google:searchClient}{google:sourceId}{google:contextualSearchVersion}ie={inputEncoding}'

Set-ItemProperty -Path 'HKCU:\Software\Policies\Microsoft\Edge' -Name 'DefaultSearchProviderName' -Value 'Google'

Set-ItemProperty -Path 'HKCU:\Software\Policies\Microsoft\Edge' -Name 'SearchScopes' -Value 0
HKEY_LOCAL_MACHINE\SOFTWARE\Policies\Microsoft\MicrosoftEdge\SearchScopes




### Search string in all the files in directy

Get-ChildItem -Recurse | Select-String "manejo de" -List | Select Path


 Get-Content -Encoding UTF8 "C:\Users\ohernandez\Desktop\Local\Tools\Vumsy\json\2022-07-12 SINNA.json" | Where-Object {$_ -notmatch 'vulnerability_evidence_image_path'








Get-SmbShare Get-SmbShare -Name "VMS1"

# Rutas compartidas local
Get-SMBShare

# Rutas comaprtidas en servidore remoto



python -m http.server 9000
python -m pip install simple-http-server

curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
python get-pip.py







Ambos
Enable-PSRemoting -Force
Sino
Enable-PSRemoting -Force -SkipNetworkProfileCheck

Ambos
 Set-Item WSMan:\localhost\Client\TrustedHosts -Value "*" -Force
Ambos
Restart-Service WinRM

Test-WsMan 172.19.51.31


$Credential= Get-Credential -UserName ticuser -Message 'Enter Password'
$sess = New-PSSession -Credential $Credential -ComputerName 172.19.51.31
Enter-PSSession $sess

<Run commands in remote session> sr3.2020***

Exit-PSSession
Remove-PSSession $sess



$User = "ticuser"
$PWord = ConvertTo-SecureString -String "&HOF=9" -AsPlainText -Force
$Credential = New-Object -TypeName System.Management.Automation.PSCredential -ArgumentList $User, $PWord
$sess = New-PSSession -Credential $Credential -ComputerName 172.19.51.31
Enter-PSSession $sess

Get-PSSession | Remove-PSSession

# Copy file
Copy-Item -FromSession $sess "C:\Users\TICUSER\Desktop\WinSCP.exe" -Destination "C:\Users\ohernandez\Desktop"



obtain wifi 
netsh wlan show profile name="TELECOM" key=clear

all wifi passwords, en español por el "Contenido de la clave"

(netsh wlan show profiles) | Select-String "\:(.+)$" | %{$name=$_.Matches.Groups[1].Value.Trim(); $_} | %{(netsh wlan show profile name="$name" key=clear)} | Select-String "Contenido de la clave\W+\:(.+)$" | %{$pass=$_.Matches.Groups[1].Value.Trim(); $_} | %{[PSCustomObject]@{ PROFILE=$name;PASS=$pass }} | Format-Table -AutoSize



 ssh -R 9000:localhost:8080 nokey@localhost.run


python -m pip install virtualenv
 virtualenv --python=python2.7 something


 python2 -m pip install virtualenv
 virtualenv --python=python2.7 venv2

curl https://bootstrap.pypa.io/pip/2.7/get-pip.py -o get-pip.py
python2 get-pip.py
python2 -m pip install virtualenv
virtualenv --python=python2.7 venv2
python2 -m pip install -r requirements.txt





https://console.cloud.google.com/apis/dashboard
https://dashboard.ngrok.com/get-started/your-authtoken


python2 -m pip freeze | grep -v "^-e" | xargs python2 -m pip uninstall -y
grep -rnw .  -e 'core.ngrok'

pip freeze | grep -v "^-e" | xargs pip uninstall -y

 python3 -m pip freeze | grep -v "^-e" | xargs python3 -m pip uninstall -y


 sudo python3 -m pip install -r requirements.txt


pip3 install -r requirements.txt



 netsh interface portproxy add v4tov4 listenaddress=0.0.0.0 listenport=8080 connectaddress=localhost connectport=8080

 netsh advfirewall firewall add rule name="Allowing LAN connections" dir=in action=allow protocol=TCP localport=8080




  curl -s https://ngrok-agent.s3.amazonaws.com/ngrok.asc | sudo tee /etc/apt/trusted.gpg.d/ngrok.asc >/dev/null && echo "deb https://ngrok-agent.s3.amazonaws.com buster main" | sudo tee /etc/apt/sources.list.d/ngrok.list && sudo apt update && sudo apt install ngrok




  2018 answer
Use clipboard-cli. It works with macOS, Windows, Linux, OpenBSD, FreeBSD, and Android without any real issues.

Install it with:

npm install -g clipboard-cli
Then you can do:

echo foo | clipboard 
If you want, you can alias to cb by putting the following in your .bashrc, .bash_profile, or .zshrc:

alias cb=clipboard


## NVIM
Note: When CTRL-V is mapped (e.g., to paste text) you can
often use CTRL-Q instead |i_CTRL-Q|

# Propagtate changes
press ctrl+v
select columns
press shift+i
write your text
press esc
press "jj"

Use d to delte in multilelines
igual mtliples lineas CNTROL C para borrair


# Show tab and spaces

Show non-space whitespace with

set list
Additionally show spaces as . with

set lcs+=space:·
set listchars=tab:▸·

Turn it off with
set nolist




Search strings:

grep -o '".*"' somefile | tr -d '"'

Delete sctrings from lines
```
grep -E 'hash_id' decrypted.txt   | sed 's/"//g' | sed 's/,//g' | sed 's/hash_id//g' | sed 's/://g'| sed -e 's/^\s*//' -e '/^$/d'  >> hash_id_list.txt
```
```
mv hash_id_list.txt  /mnt/c/Users/ohernandez/Desktop/
```
	
	 
## Powershell

### Count the number of files in directory
```
(Get-ChildItem .\Actual\ | Measure-Object).Count
```

	
```	
git checkout --orphan newBranch
git add -A  # Add all files and commit them
git commit -m "New nitial commit"
git branch -D main  # Deletes the master branch
git branch -m main  # Rename the current branch to master
git push -f origin main  # Force push master branch to github
git gc --aggressive --prune=all     # remove the old files
```

	
```	
Start-Job { & C:\Full\Path\To\my.exe }
```
	
### SCP Copy
```	
scp -P 28 .\Desktop\Imagen1.png admin@127.0.0.1:c:\Users\Admin\Desktop\python-reportlab-example	
```
	
