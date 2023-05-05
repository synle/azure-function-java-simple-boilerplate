package com.function;


import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import java.util.*;


/**
 * Azure Functions with HTTP Trigger.
 */
public class HttpTriggerJava1 {
    /**
     * This function listens at endpoint "/api/HttpTriggerJava1". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/HttpTriggerJava1
     * 2. curl {your host}/api/HttpTriggerJava1?name=HTTP%20Query
     */
    @FunctionName("HttpTriggerJava1")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");

        // Parse query parameter
        String query = request.getQueryParameters().get("name");
        String name = request.getBody().orElse(query);

        if (name == null) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST).body("Please pass a name on the query string or in the request body").build();
        } else {
            return request.createResponseBuilder(HttpStatus.OK).body("Hello, " + name).build();
        }
    }

    // TODO: remove if needed.
    // this is the cosmos db trigger examples
    // this is triggered for both insert and update
    // @FunctionName("CosmosTriggerAndOutput")
    // public void CosmosTriggerAndOutput(
    //     @CosmosDBTrigger(
    //         name = "items",
    //         databaseName = "%TargetCosmosDatabase%",
    //         collectionName = "%TargetCosmosCollection%",
    //         connectionStringSetting = "AzureCosmosDbConnection",
    //         createLeaseCollectionIfNotExists = true) Object[] items,
    //     final ExecutionContext context) {
    //     context.getLogger().info(">> Total Items Received from CosmosDB: " + items.length);
    //     for(Object item : items){
    //         context.getLogger().info(">> Item Found: " + item);
    //     }
    // }
}
