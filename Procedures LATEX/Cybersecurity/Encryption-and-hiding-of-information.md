## Concatenateion bytes steganography


```
wget "https://4kwallpapers.com/images/walls/thumbs_2t/5918.jpg" -O picture-0.jpg
```

```
mkdir ghccdm
```

```
echo "Secret message"  > hidden.txt
```


```
zip -r hidden.zip ghccdm
```

```
 cmd /c copy /B .\picture-1.jpg +  .\hidden.zip .\picture-1.jpg
```

```
file picture-1.jpg
```

```
unzip picture-1.jpg
```

Detect zip file in hex dump text file
```
hexdump picture-1.jpg| grep -E "4b50 0403|d8ff
```

## RGB powershell script steganography

```
wget https://github.com/peewpw/Invoke-PSImage/archive/refs/heads/master.zip -O psimage.zip
```

```
unzip psimage.zip
```

```
cd Invoke-PSImage-master/
```

```
Import-Module .\Invoke-PSImage.ps1
```


```
wget "https://4kwallpapers.com/images/walls/thumbs_2t/5918.jpg" -O picture-0.jpg
```

```
echo "New-Item new_file.txt -type file"  > psscript.ps1
```


For local execution
```
Invoke-PSImage -Script .\psscript.ps1 -Out .\picture-injected.jpg -Image .\picture-0.jpg
```


Example of generated code:
```
sal a New-Object;Add-Type -A System.Drawing;$g=a System.Drawing.Bitmap("C:\Users\ohernandez\Desktop\Invoke-PSImage-master\picture-injected.jpg");$o=a Byte[] 800;(0..0)|%{foreach($x in(0..799)){$p=$g.GetPixel($x,$_);$o[$_*800+$x]=([math]::Floor(($p.B-band15)*16)-bor($p.G-band15))}};$g.Dispose();IEX([System.Text.Encoding]::ASCII.GetString($o[0..33]))
```

For web request execution
```
Invoke-PSImage -Script .\psscript.ps1 -Out .\picture-injected.jpg -Image .\picture-0.jpg -WebRequest
```

### References 

- Simple and Secure Image Steganography using LSB and Triple XOR Operation on MSB (https://ieeexplore.ieee.org/document/8350661/)


## Using LSB 

```
pip install tinyscript
```

```
wget https://gist.githubusercontent.com/dhondta/d2151c82dcd9a610a7380df1c6a0272c/raw/stegolsb.py && chmod +x stegolsb.py
```

```
wget "https://4kwallpapers.com/images/walls/thumbs_2t/5918.jpg" -O picture-0.jpg
```

```
stegolsb wavsteg -h -i picture-0.jpg -s hidden.txt -o picture-lsb.jpg -n 1

python3 stegolsb.py -v extract test.png --column-step 2 --rows 1 --cols 128
```




```
python3 embedding.py  -c picture-0.jpg -m hidden.txt -s stego-picture.jpg
```


## Base32/64 padding

```
pip install tinyscript
```

```
wget https://gist.githubusercontent.com/dhondta/90a07d9d106775b0cd29bb51ffe15954/raw/paddinganograph.py && chmod +x paddinganograph.py 
```

```
wget "https://4kwallpapers.com/images/walls/thumbs_2t/5918.jpg" -O picture-0.jpg 
```

```
exiftool -Comment="Secret words" picture-0.jpg 
```

```
exiftool picture-0.jpg
```

```

python3 paddinganograph.py  -e base64 -f Comment -s . < picture-0.jpg | python3 paddinganograph.py  -e base32

python3 paddinganograph.py  -e base64 -f Comment -s . < picture-0.jpg
```

```
python3 paddinganograph.py -s "." -f "Comment" < tmpgrg7hqc2.jpg
```