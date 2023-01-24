
```
New-Item -ItemType SymbolicLink -Path "Link" -Target "Target"
```

## Update

```
python .\vumsy-cli.py  -j .\config.json --update vulnerabilities
```

```
python .\vumsy-cli.py  -j .\config.json --update inventory
```

## Export

```
python .\vumsy-cli.py  -j .\config.json --export vulnerabilities
```

```
python .\vumsy-cli.py  -j .\config.json --export hostsvulns
```

## Load

### Load Static Code Analysis
```
python .\vumsy-cli.py  -j .\config.json --load appvulnse -f "C:\Users\ohernandez\Desktop\SourceCodeAnalize\code_issues_pcc.csv" --loaddate "11/01/2023"
```


### Load Dynamic Code Analysis
```
python .\vumsy-cli.py  -j .\config.json --load appvulnsd -f "C:\Users\ohernandez\Desktop\DynamicAnalysis\DAV-COAS\Hallazgos-vulnerabilidades-COAS.xlsx"  --loaddate "31/12/2022"

```

### Load Vulns Host 
```
python .\vumsy-cli.py  -j .\config.json --load hostvulns -f "file.csv"  --loaddate "31/12/2022"

```

### Load Vulns Host History WARNING REPLACE!!
```
python .\vumsy-cli.py  -j .\config.json --load hostvulnshist -f "C:\Users\ohernandez\Desktop\DynamicAnalysis\DAV-COAS\Hallazgos-vulnerabilidades-COAS.xlsx" 

```
## Generate

### Generate report static vulnerabilities
```
python .\vumsy-cli.py  -j .\config.json --genreport static_av_banobras --startdate "01/12/2022" --enddate "31/12/2022" --gendate "06/01/2023"
```


### Generate matrix report for apps vulnerabilities

```
python .\vumsy-cli.py  -j .\config.json --genreport banobras_apps_vulns_matrix --startdate "01/12/2022" --enddate "31/12/2022" --gendate "06/01/2023"
```

### Generate template for New Dynamic Analysis

```
python .\vumsy-cli.py  -j .\config.json --gentemplate newdavbanobras --name "COAS"
```


rules.sonarsource.com "javascript:S5852"
sonarsource.github.io "javascript:S5852"
https://sonarsource.github.io/rspec/#/rspec/?query=S5852

https://sonarsource.github.io/rspec/#/rspec/S5852
severity




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

## Python libraries

Para python hay que copias las lirbeari globales en sites-packages


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
sonar-findings-export -k "BANOBRAS-PCC" -o code_issues_pcc.csv
```

```
startSonar
```

```
 sonar-findings-export -t "squ_0912a286a9be86060d4e00abaa45f832f0edfa56" -u "http://localhost:9000" -k "BANOBRAS-COAS" -f code_issues_coa.csv --format csv --types SECURITY_HOTSPOT,VULNERABILITY
 ```
 
