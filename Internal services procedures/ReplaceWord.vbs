Dim filePath
Dim searchValue
Dim replaceValue

filePath = Wscript.arguments(0)
searchValue = Wscript.arguments(1)
replaceValue = Wscript.arguments(2)

WScript.echo filePath

Const wdReplaceAll = 2

Set objWord = CreateObject("Word.Application")

objWord.Visible = False

Set objDoc = objWord.Documents.Open(filePath)

Set objSelection = objWord.Selection

objSelection.Find.Text = searchValue

objSelection.Find.Forward = TRUE

objSelection.Find.MatchWholeWord = TRUE

objSelection.Find.Replacement.Text = replaceValue

objSelection.Find.Execute ,,,,,,,,,,wdReplaceAll

objWord.Documents.Save

objWord.Quit