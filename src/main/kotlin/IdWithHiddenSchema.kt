import org.eclipse.microprofile.openapi.annotations.enums.SchemaType
import org.eclipse.microprofile.openapi.annotations.media.Schema

@JvmInline
@Schema(hidden = true)
value class IdWithHiddenSchema(val value: Long)
