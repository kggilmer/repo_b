
class ShrubGenerator : ThingGenerator {
    override fun generate(input: String): Thing? {
        return Thing("some lame shrub")
    }

    override fun generateThings(): SomeThings {
        return listOf(Thing("Lilac"), Thing("Blueberry"))
    }
}
