# Simple Azure Function Boilderplate

## Run it locally

### Run it
```
gradle azureFunctionsRun
```

### To see it
```
# Please pass a name on the query string or in the request body
http://localhost:7071/api/HttpTriggerJava1
```

## Deploy it
```
gradle azureFunctionsDeploy
```

## Local JSON
Secrets for connection string can be stored in `local.settings.json`
