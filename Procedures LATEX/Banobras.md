
```
python .\vumsy-cli.py  -j .\config.json --load appvulns -f "C:\\Users\\ohernandez\\Desktop\\SourceCodeAnalize\\code_issues_coa.csv"
```
```
python .\vumsy-cli.py  -j .\config.json --export vulnerabilities
```


 -h, --help       show this help message and exit
  -j J             JSON config file report path
  --update UPDATE  Update value
  --load LOAD      Load value to db
  --export EXPORT  Export csv from database table
  --report REPORT  Generate a report
  -f F             File path to use

Excel


Formatos de word
Elimitar Deer ecaner esatico superior derecnho
Borrar imagenes



```
document.querySelectorAll('td').forEach(function(e, i) {
    if (e.textContent.trim().length == 0) { // if row is empty
        e.parentNode.removeChild(e);
    }
})


document.querySelectorAll('tr').forEach(function(e, i) {
    if (e.textContent.trim().length == 0) { // if row is empty
        e.parentNode.removeChild(e);
    }
})
```


```
SET SONAR_HOST_URL=http://localhost:9000
SET SONAR_TOKEN=squ_d9e13aabc796836ec821ee43aad96ce1ef4a736c

sonar-findings-export -k "BANOBRAS-COAS" -o BANOBRAS-COAS.csv
```
# Exports all issues of project myProjectKey
```
sonar-findings-export -k "BANOBRAS-COAS" -o BANOBRAS-COAS.csv
```

