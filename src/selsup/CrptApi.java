//package selsup;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.time.Duration;
//import java.time.temporal.ChronoUnit;
//import java.util.concurrent.Semaphore;
//import java.util.concurrent.TimeUnit;
//
//import netscape.javascript.JSObject;
//import org.json.JSONObject;
//
//public class CrptApi {
//    private final HttpClient httpClient;
//    private final Semaphore semaphore;
//    private final long requestLimit;
//    private final long timeInterval;
//
//    public CrptApi(TimeUnit timeUnit, int requestLimit) {
//        this.httpClient = HttpClient.newHttpClient();
//        this.requestLimit = requestLimit;
//        this.timeInterval = timeUnit.toMillis(1);
//        this.semaphore = new Semaphore(requestLimit);
//    }
//
//    public void createDocument(Document document, String signature) throws IOException, InterruptedException {
//        // Create JSON payload
//        JSONObject payload = new JSO NObject();
//        payload.put("description", new JSONObject().put("participantInn", document.getParticipantInn()));
//        payload.put("doc_id", document.getDocId());
//        payload.put("doc_status", document.getDocStatus());
//        payload.put("doc_type", "LP_INTRODUCE_GOODS");
//        payload.put("importRequest", true);
//        payload.put("owner_inn", document.getOwnerInn());
//        payload.put("participant_inn", document.getParticipantInn());
//        payload.put("producer_inn", document.getProducerInn());
//        payload.put("production_date", document.getProductionDate());
//        payload.put("production_type", document.getProductionType());
//        payload.put("products", document.getProducts());
//        payload.put("reg_date", document.getRegDate());
//        payload.put("reg_number", document.getRegNumber());
//
//        // Acquire semaphore
//        semaphore.acquire();
//
//        try {
//            // Create HTTP request
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create("https://ismp.crpt.ru/api/v3/lk/documents/create"))
//                    .POST(HttpRequest.BodyPublishers.ofString(payload.toString()))
//                    .build();
//
//            // Send request and get response
//            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//
//            // Check response status code
//            if (response.statusCode() != 200) {
//                throw new IOException("Failed to create document: " + response.statusCode());
//            }
//        } finally {
//            // Release semaphore
//            semaphore.release();
//        }
//    }
//
//    private static class Document {
//        private String participantInn;
//        private String docId;
//        private String docStatus;
//        private String ownerInn;
//        private String producerInn;
//        private String productionDate;
//        private String productionType;
//        private JSONObject products;
//        private String regDate;
//        private String regNumber;
//
//        // getters and setters
//    }
//}