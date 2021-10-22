fun main() {
    val tg: ThingGenerator = TreeGenerator()

    println(tg.generate("boo")?.name)

    val tg2 = ShrubGenerator()

    println(tg2.generate("asdf")?.name)
}


class ShrubGenerator : ThingGenerator {
    override fun generate(input: String): Thing? {
        return Thing("some lame shrub")
    }
}