//package com.serverless;
//
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.cloud.function.context.FunctionRegistration;
//import org.springframework.cloud.function.context.FunctionType;
//import org.springframework.cloud.function.context.FunctionalSpringApplication;
//import org.springframework.context.ApplicationContextInitializer;
//import org.springframework.context.support.GenericApplicationContext;
//
//import java.util.function.Function;
//
//@SpringBootConfiguration
//public class MyFunction implements ApplicationContextInitializer<GenericApplicationContext> {
//
//    public static void main(String[] args) throws Exception {
//        FunctionalSpringApplication.run(MyFunction.class, args);
//    }
//
//    @Override
//    public void initialize(GenericApplicationContext context) {
//        context.registerBean("function", FunctionRegistration.class,
//                () -> new FunctionRegistration<Function<String, String>>(handleRequest())
//                        .type(FunctionType.from(String.class).to(String.class).getType()));
//    }
//
//
//    public Function<String, String> handleRequest() {
//        return value -> {
//          return value;
//        };
////        LOG.info("received: " + input);
////        Response responseBody = new Response("Go Serverless v1.x! Your function executed successfully!", input);
////
////        // dynamodb
////        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
////                .withRegion(Regions.AP_NORTHEAST_1)
////                .build();
////        HashMap<String, AttributeValue> item_values = new HashMap<String,AttributeValue>();
////        item_values.put("id", new AttributeValue("id"));
////        item_values.put("name", new AttributeValue("name"));
////        client.putItem("TestTable", item_values);
////
////        return ApiGatewayResponse.builder()
////                .setStatusCode(200)
////                .setObjectBody(responseBody)
////                .setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & serverless"))
////                .build();
//    }
//}
