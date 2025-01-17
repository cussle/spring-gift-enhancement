package gift.dto.category;

public record CategoryResponse(
    Long id,
    String name,
    String color,
    String imageUrl,
    String description
) {

}
