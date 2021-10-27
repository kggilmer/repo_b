
class ShrubGenerator : ThingGenerator {
    override fun generate(input: String): Thing? {
        return if (input.endsWith("tree")) {
            val tg = TreeGenerator()
            tg.generate(input)
        } else {
            Thing("some lame shrub")
        }
    }

    override fun generateThings(): SomeThings {
        return listOf(Thing("Lilac"), Thing("Blueberry"))
    }
}
