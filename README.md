# Simple Azure Function Boilderplate

## Run it locally

### Update `local.settings.json`

Use the template `local.settings.json.bak` and create a template for your local testings.

```
cp local.settings.json.bak local.settings.json
```

Update that `local.settings.json` with your environment

### Run it locally
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


## Useful docs
- https://docs.microsoft.com/en-us/azure/azure-functions/functions-reference-java?tabs=bash%2Cconsumption#environment-variables
