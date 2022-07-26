import org.eclipse.microprofile.openapi.annotations.enums.SchemaType
import org.eclipse.microprofile.openapi.annotations.media.Schema

@JvmInline
@Schema(implementation = Long::class, type = SchemaType.INTEGER)
value class IdWithSchema(val value: Long)
