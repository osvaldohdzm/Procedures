# Investigatión

### TRadeuce VBA

es mejro traaducir gooel shet una hoha en blanco e ir pasando datos


```
Public Function Traducir(texto As String, sl As String, tl As String) As String
    
    Application.ScreenUpdating = False
    
    Dim XMLPage As New MSXML2.XMLHTTP60
    Dim htmldoc As New MSHTML.HTMLDocument
    Dim htmlim As MSHTML.IHTMLElement
    Dim htmlims As MSHTML.IHTMLElementCollection
    Dim URL As String
        
    URL = "https://www.bing.com/ttranslatev3?isVertical=1&&IG=56621AD6CDD14B9B9B9F1E7936027403&IID=translator.5022.1"
            
    sBody = "fromLang=" & sl & _
    "&to=" & tl & _
    "&text=" & texto & _
    "&token=daK0ULSdP1ckXRcSDCRY1mTdRgBxW8un&key=1665705433206"
    
    XMLPage.Open "Post", URL, False
    XMLPage.setRequestHeader "Content-Type", "application/x-www-form-urlencoded"
    XMLPage.setRequestHeader "X-Requested-With", "XMLHttpRequest"
    XMLPage.send sBody
    
    Debug.Print XMLPage.responseText
    
    htmldoc.body.innerHTML = XMLPage.responseText
    textoatraducir = Split(XMLPage.responseText, "text"":""")
    traduccion = Split(textoatraducir(1), """")
    Traducir = WorksheetFunction.Proper(traduccion(0))
    
    '=Traducir(  ,"en","es")

End Function
```

git remote get-url origin


```
  100  wget https://github.com/jarun/ddgr/archive/refs/tags/v2.0.tar.gz
  101  ls
  102  sudo tar -xvzf v2.0.tar.gz
  103  ls
  104  cd ddgr-2.0/
  105  ls
  106  sudo make install
  107  ls
./ddgr -x

jquery 1.6 vulnerabilities vulnerability exploits exploits vuln  hack zeroday 

type number 

exit q

sudo apt install w3m w3m-img
export BROWSER=w3m
w3m xyz.com

sudo apt install lynx
To get started, you just have to follow the command below:

lynx examplewebsite.com
```


