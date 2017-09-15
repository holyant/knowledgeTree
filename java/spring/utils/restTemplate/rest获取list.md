###ClassCastException: RestTemplate returning List<LinkedHashMap> instead of List<MymodelClass>
>https://stackoverflow.com/questions/19463372/classcastexception-resttemplate-returning-listlinkedhashmap-instead-of-listm

####1
```java
ParameterizedTypeReference<List<com.junf.bbdServiceApi.dto.CapitalPoolOccupationDto>> typeRef = new ParameterizedTypeReference<List<com.junf.bbdServiceApi.dto.CapitalPoolOccupationDto>>() {};
        ResponseEntity<List<com.junf.bbdServiceApi.dto.CapitalPoolOccupationDto>> responseEntity = cloudRestTemplate.exchange("http://bbd-service/capitalPool/latestCapitalPoolOccupations", HttpMethod.GET, null, typeRef);
        List<com.junf.bbdServiceApi.dto.CapitalPoolOccupationDto> myModelClasses = responseEntity.getBody();

```
####2
```java
com.junf.bbdServiceApi.dto.CapitalPoolOccupationDto[] myModelClass= cloudRestTemplate.getForObject("http://bbd-service/capitalPool/latestCapitalPoolOccupations", com.junf.bbdServiceApi.dto.CapitalPoolOccupationDto[].class);
```