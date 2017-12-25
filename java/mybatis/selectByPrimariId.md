####Mapper.selectByPrimaryKey(id);查询报错
>Caused by: org.apache.ibatis.type.TypeException: Error setting non null for parameter #2 with JdbcType null . Try setting a different JdbcType for this parameter or a different configuration property. Cause: java.lang.ClassCastException: java.lang.Long cannot be cast to java.lang.String


####处理
>domain中要加@id注解

```java
@Entity
@Table(name = "bbd_payment_application")
public class PaymentApplication {
    @Id
    private Long id;

```