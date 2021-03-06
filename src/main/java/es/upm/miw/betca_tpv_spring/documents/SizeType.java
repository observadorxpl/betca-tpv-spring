package es.upm.miw.betca_tpv_spring.documents;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SizeType {

    @Id
    private String id;
    private String name;

    public SizeType(){

    }

    public  SizeType(String id, String name)
    {
        this.id  = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SizeType{" +
                "id='" + id + '\'' +
                ", name='" + name +
                '}';
    }

}