fun main() {
    val tg: ThingGenerator = TreeGenerator()

    println(tg.generate("oak tree")?.name)

    val tg2 = ShrubGenerator()

    println(tg2.generate("shrub")?.name)
}
