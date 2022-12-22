# Powerquery

## Translate text


Example of web query
```
let
    Origen = Web.Page(Web.Contents("https://www.tenable.com/plugins/nessus/34460")),
    Data0 = Origen{0}[Data]
in
    Data0
```


Function: getNessusReferences
```
let
 getNessusReferences= (nessusPluginId as number) as text =>
            let
                Source = Web.Page(Web.Contents("https://www.tenable.com/plugins/nessus/" &  Number.ToText(nessusPluginId)  )),
  #"Se expandió Data" = Table.ExpandTableColumn(Source, "Data", {"Kind", "Name", "Children", "Text"}, {"Data.Kind", "Data.Name", "Data.Children", "Data.Text"}),
    #"Data Children" = #"Se expandió Data"{0}[Data.Children],
    Children = #"Data Children"{1}[Children],
    Children1 = Children{0}[Children],
    Children2 = Children1{0}[Children],
    Children3 = Children2{2}[Children],
    Children4 = Children3{0}[Children],
    Children5 = Children4{1}[Children],
    Children6 = Children5{1}[Children],
    Children7 = Children6{3}[Children],
    Children8 = Children7{0}[Children],
    Children9 = Children8{1}[Children],
    Children10 = Children9{0}[Children],
    Children11 = Children10{0}[Children],
    Children12 = Children11{0}[Children],
    Children13 = Children12{3}[Children],
    #"Se expandió Children" = Table.ExpandTableColumn(Children13, "Children", {"Kind", "Name", "Children", "Text"}, {"Children.Kind", "Children.Name", "Children.Children", "Children.Text"}),
    #"Se expandió Children.Children" = Table.ExpandTableColumn(#"Se expandió Children", "Children.Children", {"Kind", "Name", "Children", "Text"}, {"Children.Children.Kind", "Children.Children.Name", "Children.Children.Children", "Children.Children.Text"})[Children.Children.Text],
    #"Elementos superiores quitados" = Text.Combine( List.Skip(#"Se expandió Children.Children",1) , "#(lf)")
in
    #"Elementos superiores quitados"

in getNessusReferences
```
Function: getNessusVulnerability
```
let
 getNessusVulnerability = (nessusPluginId as number) as text =>
            let
                Source = Web.Page(Web.Contents("https://www.tenable.com/plugins/nessus/" &  Number.ToText(nessusPluginId)  )),
 #"Se expandió Data" = Table.ExpandTableColumn(Source, "Data", {"Kind", "Name", "Children", "Text"}, {"Data.Kind", "Data.Name", "Data.Children", "Data.Text"}),
    #"Data Children" = #"Se expandió Data"{0}[Data.Children],
    Children = #"Data Children"{1}[Children],
    Children1 = Children{0}[Children],
    Children2 = Children1{0}[Children],
    Children3 = Children2{2}[Children],
    Children4 = Children3{0}[Children],
    Children5 = Children4{1}[Children],
    Children6 = Children5{1}[Children],
    Children7 = Children6{2}[Children],
    Children8 = Children7{0}[Children],
    Children9 = Text.Combine( Children8{0}[Children][Text] )
in
    Children9

in getNessusVulnerability
```


Function: getNessusDescription
```
let
 getNessusDescription = (nessusPluginId as number) as text =>
            let
                Source = Web.Page(Web.Contents("https://www.tenable.com/plugins/nessus/" &  Number.ToText(nessusPluginId)  )),
 #"Se expandió Data" = Table.ExpandTableColumn(Source, "Data", {"Kind", "Name", "Children", "Text"}, {"Data.Kind", "Data.Name", "Data.Children", "Data.Text"}),
    #"Data Children" = #"Se expandió Data"{0}[Data.Children],
    Children = #"Data Children"{1}[Children],
    Children1 = Children{0}[Children],
    Children2 = Children1{0}[Children],
    Children3 = Children2{2}[Children],
    Children4 = Children3{0}[Children],
    Children5 = Children4{1}[Children],
    Children6 = Children5{1}[Children],
    Children7 = Children6{3}[Children],
    Children8 = Children7{0}[Children],
    Children9 = Children8{1}[Children],
    Children10 = Children9{0}[Children],
    Children11 = Children10{0}[Children],
    Children12 = Children11{0}[Children],
    Children13 = Children12{1}[Children],
    Result = Text.Replace(    Text.Combine( Table.ExpandTableColumn(Children13, "Children", {"Kind", "Name", "Children", "Text"}, {"Children.Kind", "Children.Name", "Children.Children", "Children.Text"})[Children.Text], "#(lf)" ) , "Description#(lf)", "")
in
    Result

in getNessusDescription
```

Function: getNessusSolution
```
let
   getNessusSolution = (nessusPluginId as number) as text =>
            let
                Source = Web.Page(Web.Contents("https://www.tenable.com/plugins/nessus/" &  Number.ToText(nessusPluginId) )),
                nessusData = Source{0}[Data],
    #"Se expandió Children" = Table.ExpandTableColumn(nessusData , "Children", {"Kind", "Name", "Children", "Text"}, {"Children.Kind", "Children.Name", "Children.Children", "Children.Text"}),
    #"Children Children" = #"Se expandió Children"{1}[Children.Children],
   Children = #"Children Children"{0}[Children],
    Children1 = Children{0}[Children],
    Children2 = Children1{2}[Children],
    Children3 = Children2{0}[Children],
    Children4 = Children3{1}[Children],
    Children5 = Children4{1}[Children],
    Children6 = Children5{3}[Children],
    Children7 = Children6{0}[Children],
    Children8 = Children7{1}[Children],
    Children9 = Children8{0}[Children],
    Children10 = Children9{0}[Children],
    Children11 = Children10{0}[Children],
    Children12 = Children11{2}[Children],
    #"Se expandió Children1" = Text.Replace(    Text.Combine(  Table.ExpandTableColumn(Children12, "Children", {"Text"}, {"Children.Text"})[Children.Text] , "#(lf)" ) , "Solution#(lf)", "")
in
    #"Se expandió Children1"

in getNessusSolution
```

Function: getNessusSeverity
```
let
   getNessusSeverity = (nessusPluginId as number) as text =>
            let
                Source = Web.Page(Web.Contents("https://www.tenable.com/plugins/nessus/" &  Number.ToText(nessusPluginId) )),
 #"Se expandió Data" = Table.ExpandTableColumn(Source, "Data", {"Kind", "Name", "Children", "Text"}, {"Data.Kind", "Data.Name", "Data.Children", "Data.Text"}),
    #"Data Children" = #"Se expandió Data"{0}[Data.Children],
    Children = #"Data Children"{1}[Children],
    Children1 = Children{0}[Children],
    Children2 = Children1{0}[Children],
    Children3 = Children2{2}[Children],
    Children4 = Children3{0}[Children],
    Children5 = Children4{1}[Children],
    Children6 = Children5{1}[Children],
    Children7 = Children6{3}[Children],
    Children8 = Children7{0}[Children],
    Children9 = Children8{1}[Children],
    Children10 = Children9{0}[Children],
    Children11 = Children10{0}[Children],
    Children12 = Children11{1}[Children],
    Children13 = Children12{1}[Children],
    Children14 = Children13{0}[Children],
    Children15 = Text.Combine( Children14{1}[Children][Text] , "#(lf)" )
in
    Children15

in getNessusSeverity
```

Function: getNessusCVE
```
let
   getNessusCVE = (nessusPluginId as number) as text =>
            let
                Source = Web.Page(Web.Contents("https://www.tenable.com/plugins/nessus/" &  Number.ToText(nessusPluginId) )),
 #"Se expandió Data" = Table.ExpandTableColumn(Source, "Data", {"Kind", "Name", "Children", "Text"}, {"Data.Kind", "Data.Name", "Data.Children", "Data.Text"}),
    #"Data Children" = #"Se expandió Data"{0}[Data.Children],
    Children = #"Data Children"{1}[Children],
    Children1 = Children{0}[Children],
    Children2 = Children1{0}[Children],
    Children3 = Children2{2}[Children],
    Children4 = Children3{0}[Children],
    Children5 = Children4{1}[Children],
    Children6 = Children5{1}[Children],
    Children7 = Children6{3}[Children],
    Children8 = Children7{0}[Children],
    Children9 = Children8{1}[Children],
    Children10 = Children9{0}[Children],
    Children11 = Children10{0}[Children],
    Children12 = Children11{1}[Children],
    Children13 = Children12{26}[Children],
    Children14 = Children13{1}[Children],
    Children15 = Children14{1}[Children],
    Children16 = Text.Combine( Children15{0}[Children][Text] , "#(lf)" )
in
    Children16

in getNessusCVE
```

Function: getNessusCVSSVector
```
let
   getNessusCVSSVector = (nessusPluginId as number) as text =>
            let
                Source = Web.Page(Web.Contents("https://www.tenable.com/plugins/nessus/" &  Number.ToText(nessusPluginId) )),
 #"Se expandió Data" = Table.ExpandTableColumn(Source, "Data", {"Kind", "Name", "Children", "Text"}, {"Data.Kind", "Data.Name", "Data.Children", "Data.Text"}),
    #"Data Children" = #"Se expandió Data"{0}[Data.Children],
    Children = #"Data Children"{1}[Children],
    Children1 = Children{0}[Children],
    Children2 = Children1{0}[Children],
    Children3 = Children2{2}[Children],
    Children4 = Children3{0}[Children],
    Children5 = Children4{1}[Children],
    Children6 = Children5{1}[Children],
    Children7 = Children6{3}[Children],
    Children8 = Children7{0}[Children],
    Children9 = Children8{1}[Children],
    Children10 = Children9{0}[Children],
    Children11 = Children10{0}[Children],
    Children12 = Children11{1}[Children],
    Children13 = Children12{22}[Children],
    Children14 = Children13{0}[Children],
    Children15 = Text.Combine(  Children14{1}[Children][Text] , "#(lf)" )
in
    Children15

in getNessusCVSSVector
```



QueryTable : 
```let
    Origen = Excel.CurrentWorkbook(){[Name="Tabla1"]}[Content],
    #"Tipo cambiado" = Table.TransformColumnTypes(Origen,{{"NessusPluginID", Int64.Type}}),
    #"Personalizada agregada" = Table.AddColumn(#"Tipo cambiado", "Personalizado", each getNessusSolution([NessusPluginID]) ),
    #"Columnas con nombre cambiado" = Table.RenameColumns(#"Personalizada agregada",{{"Personalizado", "Solution"}}),
    #"Personalizada agregada1" = Table.AddColumn(#"Columnas con nombre cambiado", "Personalizado", each getNessusDescription([NessusPluginID])),
    #"Columnas con nombre cambiado1" = Table.RenameColumns(#"Personalizada agregada1",{{"Personalizado", "Description"}})
in
    #"Columnas con nombre cambiado1"
```

Test with  26920

"""
Google Translation API (free version) is the web service that we will use to translate between languages.
Google Translation API (free version) has some known limitations. This is not a bug but Google's design to lower the number of allowed requests per IP in a certain amount of time. So, try sending fewer requests basically by not refreshing the query often and keeping the translation list short. Please note this article's purpose is to demonstrate using Power Query to make simple API calls and work with retrieved data.

Google Cloud Translation API is Google's paid service for translation which provides controllable quotas and limits. However, the authentication method required by this API is not discussed in this article.

Google Translation API (free version) can be accessed by using the following URL.
Rich (BB code):
https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=tr&dt=t&q=Good%20morning

This URL contains the following parameters:
sl is used for source language ISO code.
tl is used fr Target language ISO code.
q is the text to be translated.
This API endpoint returns a JSON file in array format which contains Turkish translation of "Good morning" text given in English. You can change the sl or tl parameters to translate to or from other languages. See the complete list of ISO language codes in the second column of Codes for the Representation of Names of Languages.
JSON:

```
[
    [
        [
            "Günaydın",
            "Good morning",
            null,
            null,
            1
        ]
    ]
    ,null,"en",null,null,null,null,[]
]
```

If we name this array as Source, then Source[0][0][0] array element contains the translated text. (Remember that Power Query starts numbering at zero, so Source[0][0][0] is saying the first item in the first list in the first field of the returned data.) To use Power Query for translating, you need some M code that will request this JSON file, parse its content, and load the data after some transformation to present the corresponding translation in tabular format.

Web.Contents is the M language function that we use to read an API endpoint by providing query parameters. Create a blank query in Power Query, switch to the advanced editor, and paste the following M code.
Power Query:

```
let
    Source = Web.Contents("https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=tr&dt=t&q=Good Morning")
in
    Source
```

As soon as we run the query, we will be notified to specify how we would like to connect to the web service unless you already defined permission for the Google Translation API endpoint. Click on the Edit Credentials button.
Specify how to connect
Specify how to connect

Select Anonymous access, and root level of Google Translation API as shown in the following image. Click Connect to continue.
Access Web content settings
Access Web content settings

When we run the query, API returns a file, translate.googleapis.com, which contains the JSON string that we discussed above.
Web.Contents function
Web.Contents function

We need to parse this JSON file to access the translated text. Json.Document is the function which is responsible of parsing the JSON content. Use Json.Document function as shown below.
Power Query:
```
let
    Source = Json.Document(
        Web.Contents("https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=tr&dt=t&q=Good Morning")
    )
in
    Source
```
Alternatively, you can right click on the downloaded file and select JSON to automatically apply Json.Document function.

Json.Document function
Json.Document function

Json.Document returns a list which contains the array that we discussed previously. We also discussed that Source[0][0][0] is the translated text we want to get. So, let's set the Result variable to include this array value, but using curly braces as it is used to access list element items in M code.
Power Query:

```
let
    Source = Json.Document(
        Web.Contents("https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=tr&dt=t&q=Good Morning")
    ),
    Result = Source{0}{0}{0}
in
    Result
```

Let's see how it works by analyzing the steps individually.
First, we retrieve the root element returned as Source.
Step 1
Then the first item of this list. It is another list with one list item.
Step 2
Once again, the first item in this list.
Step 3
Notice the first item of this inner list. It is the translated text. Finally, we need to retrieve the first item in this list.
Step 4
Since we know how to translate the given text now, let's create our source table which contains English sentences to translate, and name it as "Original".
English
This is a Power Query sample.
It is translating from English to another language
It has been written in M code.

Copy and paste the following code into a blank query. I intentionally included a custom function, fnTranslate(), to demonstrate basic encapsulation and reusability in M code. We don't have to do this in this project but it provides more readable code. Also, we can even create the custom function as another query and call it in many other queries.

Power Query:
```
let
    fnTranslate =
        (original as text) as text =>
            let
                Source = Json.Document(
                    Web.Contents("https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=tr&dt=t&q=" & original)
                ),
                Translation = Source{0}{0}{0}
            in
                Translation,

    Source = Excel.CurrentWorkbook(){[Name="Original"]}[Content],
    ChangeDataType = Table.TransformColumnTypes(Source,{{"English", type text}}),
    Result = Table.AddColumn(
        ChangeDataType,
        "Turkish",
        each fnTranslate([English]),
        type text
    )
in
    Result
```

Let's break down this code.
fnTranslate = (original as text) as text => let ... in ... custom function; We create a function which takes a text in English as the only parameter and does the translation as we did in the previous sample above. It still translates single text but it will be called for each row in the source table.
Excel.CurrentWorkbook(){[Name="Original"]}[Content]: We get the source data into Power Query by using Excel.CurrentWorkbook function. Excel.CurrentWorkbook function returns a table including records consist of Excel ListObjects (worksheet tables), named ranges, and dynamic ranges in the current workbook with Content and Name fields.

Excel.CurrentWorkbook function
Excel.CurrentWorkbook function

Each table row is a record in M language and each record can be selected by the row index which is starting from 0. So, myTable{0} returns the first row in a table called myTable. However, rows can be also referenced by their field values in case there is only one matched record. Since Excel table names are unique in a workbook, we can simply use this method to get the table by its name into Power Query by simply passing [Name="Original"] record instead of row index as shown below.

Retrieve Table / ListObject by name
Retrieve Table / ListObject by name

Each field in a record can be referenced by the field name in square brackets after the record identifier. So, using the sample table in the previous step, myTable{0}[field1] returns field1 field value of the first row from myTable table. Finally, we get the Content field value as a table by referencing with the field name.

Expand table in Power Query
Expand table in Power Query

TransformColumnTypes(Source,{{"English", type text}}): M language is a strict language about data types, that's why the amazing Power Query user interface always changes the row types appropriately before making any processing in records by using functions which require parameters in certain data types. Since our custom function also requires a text data type, we use Table.TransformColumnTypes function to define the field type as text.
Table.AddColumn(...): This is the step where we use Table.AddColumn function to create a new column to return translated text. Table.AddColumn function takes four parameters:

table: Source table to add a new column.
newColumnName: New column's name.
columnGenerator: A function to return new column values by processing each record in the table. We run fnTranslate() function with a text parameter to call Google Translation API for each record - . [English] is the English field (column) value for the selected row.fnTranslate([English])
columnType: This parameter defines the type of the new column. Since the new column is supposed to return text values, we used . We can also use the equivalent value, . For more information, see M Language types.type textText.Type

Finally, we get the following result when we run this query.
Result
Result

Load query to the worksheet. Try adding some more text in English into the "Original" table, and refreshing the table. Finally, we have a working translator in Excel!
English	Turkish

This is a Power Query sample.	Bu bir Power Query örneğidir.
It is translating from English to another language	İngilizceden başka bir dile çeviri yapıyor
It has been written in M code.	M kodunda yazılmıştır.



# Excel

# Power BI



# JavaScript

Obtain manual data
