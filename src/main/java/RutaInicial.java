import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;


@RegisterForReflection
@ApplicationScoped
public class RutaInicial extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:rutaInicial")
                .log("Entro la peticion: ${body}")
                .log("Segundo log: ${body}")
                .end();
    }
}
