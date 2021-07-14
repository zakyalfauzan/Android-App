package com.example.classicalcomposer

object ComposerData {

    private val composerNames = arrayOf(
        "Isaac Albeniz",
        "Johann Sebastian Bach",
        "Frederic Chopin",
        "Heitor Villa-Lobos",
        "Agustin Barrios Mangore",
        "Wolfgang Amadeus Mozart",
        "Astor Piazzolla",
        "Giulio Regondi",
        "Fernando Sor",
        "Francisco Tarrega",
    )

    private val composerYear = arrayOf(
        "1860-1909",
        "1685-1750",
        "1810-1849",
        "1887-1959",
        "1885-1944",
        "1756-1791",
        "1921-1992",
        "1822-1872",
        "1778-1839",
        "1852-1909",
    )

    private val composerSonata = arrayOf(
        "Cordoba, Sevilla, Granada",
        "Cello Suite, Air",
        "Ballade, Nocturne",
        "Mazurka Choro, Toccata",
        "La Catedral, El Ultimo Tremolo",
        "Eine Kleine Nachtmusik, Lacrimosa",
        "Milonga del Angel, Verano Porteno",
        "Reverie, Introduction and Caprice",
        "Grand Solo, Variations on a Theme",
        "Capricho Arabe, Gran Vals, Lagrima",
    )

    private val composerDetail = arrayOf(
        "Isaac Manuel Francisco Albéniz y Pascual (29 May 1860 – 18 May 1909) was a Spanish virtuoso pianist, composer, and conductor. He is one of the foremost composers of the Post-Romantic era who also had a significant influence on his contemporaries and younger composers. He is best known for his piano works based on Spanish folk music idioms. Albéniz's early works were mostly \"salon style\" music. Albéniz's first published composition, Marcha Militar, appeared in 1868. A number of works written before this are now lost. He continued composing in traditional styles ranging from Jean-Philippe Rameau, Johann Sebastian Bach, Ludwig van Beethoven, Frédéric Chopin and Franz Liszt until the mid-1880s. He also wrote at least five zarzuelas, of which all but two are now lost.    ",
        "Johann Sebastian was a German composer and musician of the late Baroque period. He is known for instrumental compositions such as the Cello Suites and Brandenburg Concertos; keyboard works such as the Goldberg Variations, The Well-Tempered Clavier and the Toccata and Fugue in D minor; and vocal music such as the St Matthew Passion and the Mass in B minor. Since the 19th-century Bach Revival, he has been generally regarded as one of the greatest composers in the history of Western music. From an early age, Bach studied the works of his musical contemporaries of the Baroque period and those of prior generations, and those influences were reflected in his music. Like his contemporaries Handel, Telemann and Vivaldi, Bach composed concertos, suites, recitatives, da capo arias, and four-part choral music and employed basso continuo. Bach's music was harmonically more innovative than his peer composers, employing surprisingly dissonant chords and progressions, often with extensive exploration of harmonic possibilities within one piece.",
        "Frédéric François Chopin was a Polish composer and virtuoso pianist of the Romantic period who wrote primarily for solo piano. He has maintained worldwide renown as a leading musician of his era, one whose \"poetic genius was based on a professional technique that was without equal in his generation.\" Chopin was educated in the tradition of Beethoven, Haydn, Mozart and Clementi; he used Clementi's piano method with his students. He was also influenced by Hummel's development of virtuoso, yet Mozartian, piano technique. He cited Bach and Mozart as the two most important composers in shaping his musical outlook. Chopin's early works are in the style of the \"brilliant\" keyboard pieces of his era as exemplified by the works of Ignaz Moscheles, Friedrich Kalkbrenner, and others. Less direct in the earlier period are the influences of Polish folk music and of Italian opera. Much of what became his typical style of ornamentation (for example, his fioriture) is taken from singing. His melodic lines were increasingly reminiscent of the modes and features of the music of his native country, such as drones.",
        "Heitor Villa-Lobos (March 5, 1887 – November 17, 1959) was a Brazilian composer, conductor, cellist, and classical guitarist described as \"the single most significant creative figure in 20th-century Brazilian art music\". Villa-Lobos has become the best-known South American composer of all time. A prolific composer, he wrote numerous orchestral, chamber, instrumental and vocal works, totaling over 2000 works by his death in 1959. His music was influenced by both Brazilian folk music and by stylistic elements from the European classical tradition, as exemplified by his Bachianas Brasileiras (Brazilian Bachian-pieces) and his Chôros. His Etudes for classical guitar (1929) were dedicated to Andrés Segovia, while his 5 Preludes (1940) were dedicated to his spouse Arminda Neves d'Almeida, a.k.a. \"Mindinha\". Both are important works in the classical guitar repertory. His earliest pieces originated in guitar improvisations, for example Panqueca (Pancake) of 1900. The concert series of 1915–21 included first performances of pieces demonstrating originality and virtuosic technique. Some of these pieces are early examples of elements of importance throughout his œuvre. His attachment to the Iberian Peninsula is demonstrated in Canção Ibéria of 1914 and in orchestral transcriptions of some of Enrique Granados' piano Goyescas (1918, now lost). Other themes that were to recur in his later work include the anguish and despair of the piece Desesperança – Sonata Phantastica e Capricciosa no. 1 (1915), a violin sonata including \"histrionic and violently contrasting emotions\", the birds of L'oiseau blessé d'une flèche (1913), the mother–child relationship (not usually a happy one in Villa-Lobos's music) in Les mères of 1914, and the flowers of Suíte floral for piano of 1916–18 which reappeared in Distribuição de flores for flute and classical guitar of 1937.",
        "Agustín Pío Barrios  was a Paraguayan virtuoso classical guitarist and composer, largely regarded as one of the greatest performers and most prolific composers for the guitar. The folk music of Paraguay (including the polca paraguaya and vals) provided the young Barrios with his first introduction to music. In 1898, Barrios was formally introduced to the classical guitar repertoire by Gustavo Sosa Escalada. At that time, Barrios may have already composed works for the guitar, and also performed pieces written by his other composers, such as La Chinita and La Perezosa. Under the influence of his new teacher, Barrios went on to perform and study the works of Tárrega, Viñas, Sor and Aguado. Sosa Escalada was so impressed with his new pupil that he convinced Barrios's parents to let him move to Asunción to continue his education. Having already surpassed the technical and performing abilities of most guitarists, Barrios began seriously to compose around 1905.",
        "Wolfgang Amadeus Mozart, baptised as Johannes Chrysostomus Wolfgangus Theophilus Mozart,[b] was a prolific and influential composer of the Classical period. Born in Salzburg, in the Holy Roman Empire, Mozart showed prodigious ability from his earliest childhood. Already competent on keyboard and violin, he composed from the age of five and performed before European royalty, embarking on a grand tour. At 17, Mozart was engaged as a musician at the Salzburg court but grew restless and travelled in search of a better position. Mozart's music, like Haydn's, stands as an archetype of the Classical style. At the time he began composing, European music was dominated by the style galant, a reaction against the highly evolved intricacy of the Baroque. Progressively, and in large part at the hands of Mozart himself, the contrapuntal complexities of the late Baroque emerged once more, moderated and disciplined by new forms, and adapted to a new aesthetic and social milieu. Mozart was a versatile composer, and wrote in every major genre, including symphony, opera, the solo concerto, chamber music including string quartet and string quintet, and the piano sonata. These forms were not new, but Mozart advanced their technical sophistication and emotional reach. He almost single-handedly developed and popularized the Classical piano concerto. He wrote a great deal of religious music, including large-scale masses, as well as dances, divertimenti, serenades, and other forms of light entertainment.",
        "Astor Pantaleón Piazzolla was an Argentine tango composer, bandoneon player, and arranger. His works revolutionized the traditional tango into a new style termed nuevo tango, incorporating elements from jazz and classical music. A virtuoso bandoneonist, he regularly performed his own compositions with a variety of ensembles. In 1992, American music critic Stephen Holden described Piazzolla as \"the world's foremost composer of Tango music\". Piazzolla's nuevo tango was distinct from the traditional tango in its incorporation of elements of jazz, its use of extended harmonies and dissonance, its use of counterpoint, and its ventures into extended compositional forms. As Argentine psychoanalyst Carlos Kuri has pointed out, Piazzolla's fusion of tango with this wide range of other recognizable Western musical elements was so successful that it produced a new individual style transcending these influences. It is precisely this success, and individuality, that makes it hard to pin down where particular influences reside in his compositions, but some aspects are clear. The use of the passacaglia technique of a circulating bass line and harmonic sequence, invented and much used in 17th- and 18th-century baroque music but also central to the idea of jazz changes, predominates in most of Piazzolla's mature compositions. Another clear reference to the baroque is the often complex and virtuosic counterpoint that sometimes follows strict fugal behavior but more often simply allows each performer in the group to assert his voice. A further technique that emphasises this sense of democracy and freedom among the musicians is improvisation, that is borrowed from jazz in concept, but in practice involves a different vocabulary of scales and rhythms that stay within the parameters of the established tango sound-world. Pablo Ziegler has been particularly responsible for developing this aspect of the style both within Piazzolla's groups and since the composer's death.",
        "Giulio Regondi was a Swiss-born classical guitarist, concertinist and composer active in France and (mainly) the United Kingdom. Regondi was born of a German mother and an Italian father in Geneva, Switzerland. A child prodigy, Fernando Sor dedicated his Souvenir d'amitié op. 46 to Regondi in 1831, when the boy was just nine. There is a reference to his appearing in London in 1831, presented as a child prodigy of the guitar. Most of Regondi's concertina music was written for the English system, however, at which he was a virtuoso, though his guitar music is probably better known. His works for solo guitar comprise a set of etudes, variations on a theme by Bellini and five larger works. Regondi died in London.",
        "Fernando Sor was a Spanish classical guitarist and composer. Best known for writing solo classical guitar music, he also composed an opera (at the age of 19), three symphonies, guitar duos, piano music, songs, a Mass, and at least two successful ballets: Cinderella, which received over one hundred performances, and Hercule et Omphale. Partly because Sor was himself such a classical guitar virtuoso—contemporaries considered him to be the best in the world he made a point of writing didactic music for players of that instrument of all levels. His Twelve Studies Op. 6, the Twelve Studies Op. 29, the (24) Progressive Lessons Op. 31, and the (24) Very Easy Exercises Op. 35 have been widely played for two hundred years and are regularly reprinted. On the other hand, some of Sor's music, not least his popular Introduction and Variations on Mozart's \"Das klinget so herrlich\" Op. 9, is fiendishly difficult.",
        "Tárrega was born on 21 November 1852, in Villarreal, Province of Castellón, Spain. It is said that Francisco's father played flamenco and several other music styles on his guitar; when his father was away working as a watchman at the Convent of San Pascual, Francisco would take his father's guitar and attempt to make the beautiful sounds he had heard. Francisco's nickname as a child was \"Quiquet\". As a child, he ran away from his nanny and fell into an irrigation channel and injured his eyes. Fearing that his son might lose his sight completely, his father moved the family to Castellón de la Plana to attend music classes because as a musician he would be able to earn a living, even if blind. Both his first music teachers, Eugeni Ruiz and Manuel González, were blind",
    )

    private val composerPhoto = intArrayOf(
        R.drawable.albeniz,
        R.drawable.bach,
        R.drawable.chopin,
        R.drawable.lobos,
        R.drawable.mangore,
        R.drawable.mozart,
        R.drawable.piazzolla,
        R.drawable.regondi,
        R.drawable.sor,
        R.drawable.tarrega,
    )

    val listData: ArrayList<Composer>
        get(){
            val list = arrayListOf<Composer>()
            for (position in composerNames.indices){
                val composer = Composer()
                composer.name = composerNames[position]
                composer.year = composerYear[position]
                composer.sonata = composerSonata[position]
                composer.detail = composerDetail[position]
                composer.photo = composerPhoto[position]
                list.add(composer)
            }
            return list
        }

}