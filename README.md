# Investigatión

### TRadeuce VBA

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
