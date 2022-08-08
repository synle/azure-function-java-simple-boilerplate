# Simple Azure Function Boilerplate

I published an article on this. You can reference that article here at [Writing your first serverless solution with Java and Azure Functions](https://www.linkedin.com/pulse/writing-your-first-serverless-solution-java-azure-functions-sy-le).

## Prerequistes
- [Azure Functions Core Tools](https://docs.microsoft.com/en-us/azure/azure-functions/functions-run-local?tabs=v4%2Cwindows%2Cjava%2Cportal%2Cbash#v2)
- [Azure CLI](https://docs.microsoft.com/en-us/cli/azure/)
- [Azure Function for VSCode](https://marketplace.visualstudio.com/items?itemName=ms-azuretools.vscode-azurefunctions)
- [dotnet.exe (For Windows only)](https://dotnet.microsoft.com/en-us/download)

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
Secrets for connection string can be stored in `local.settings.json`. Refer to this backup of [local.settings.json.bak](https://github.com/synle/azure-function-java-simple-boilderplate/blob/main/local.settings.json.bak) file for more details


## Useful docs
- [Functions Reference Java Guide](https://docs.microsoft.com/en-us/azure/azure-functions/functions-reference-java?tabs=bash%2Cconsumption#environment-variables)
- [Create first java Azure Function with Gradle](https://docs.microsoft.com/en-us/azure/azure-functions/functions-create-first-java-gradle)
- [Change feeds in Functions](https://docs.microsoft.com/bs-latn-ba/azure/cosmos-db/sql/change-feed-functions#:~:text=The%20lease%20container%3A%20The%20lease,Functions%20trigger%20for%20Cosmos%20DB)
