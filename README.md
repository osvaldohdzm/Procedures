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
        
    URL = "https://www.bing.com/ttranslatev3?isVertical=1&&IG=677353FCE38746C590369BDE83934B97&IID=translator.5026.9"
            
    sBody = "fromLang=" & sl & _
    "&to=" & tl & _
    "&text=" & texto
    
    XMLPage.Open "Post", URL, False
    XMLPage.setRequestHeader "Content-Type", "application/x-www-form-urlencoded"
    XMLPage.setRequestHeader "X-Requested-With", "XMLHttpRequest"
    XMLPage.send sBody
    
    Debug.Print XMLPage.responseText
    
    htmldoc.body.innerHTML = XMLPage.responseText
    textoatraducir = Split(XMLPage.responseText, "text"":""")
    traduccion = Split(textoatraducir(1), """")
    Traducir = WorksheetFunction.Proper(traduccion(0))

End Function
```
