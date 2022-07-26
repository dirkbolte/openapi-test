import org.eclipse.microprofile.openapi.annotations.enums.SchemaType
import org.eclipse.microprofile.openapi.annotations.media.Schema

data class TestResponse(
    val idWithoutSchema: IdWithoutSchema? = null,
    val idWithSchema: IdWithSchema? = null,
    @field:Schema(type = SchemaType.INTEGER, implementation = Long::class, name = "idWithOverwrittenSchema")
    val idWithOverwrittenSchema: IdWithOverwrittenSchema? = null,
    val idWithHiddenSchema: IdWithHiddenSchema? = null,
)
