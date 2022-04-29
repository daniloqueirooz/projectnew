package com.example.projectnew

import com.example.projectnew.models.Live

class DataSource {

    companion object {

        fun createDataset(): ArrayList<Live> {
            val list = ArrayList<Live>()

            list.add(
                Live(
                    "#Seu Jorge - Tempo Perdido #Live HD",
                    "Danilo Queiroz",
                    "https://ibb.co/qC1wszp",
                    "https://youtu.be/z4MAD2Foh3k"
                )
            )

            list.add(
                Live(
                    "#Gusttavo Lima - Ficha Limpa",
                    "Danilo Queiroz",
                    "https://ibb.co/9yHtF7Y",
                    "https://youtu.be/ZWlZR2HKIQA"
                )
            )

            list.add(
                Live(
                    "#Maiara e Maraisa & Marília Mendonça",
                    "Danilo Queiroz",
                    "https://ibb.co/YjZpPMx",
                    "https://youtu.be/-Nir1uPim70"
                )
            )

            list.add(
                Live(
                    "#Churrasquinho Menos é Mais 2",
                    "Danilo Queiroz",
                    "https://ibb.co/q1nS6DS",
                    "https://youtu.be/vr2fp6SS8aE"
                )
            )

            list.add(
                Live(
                    "#Ferrugem - Tô Isso Aqui Pra Te Beijar ",
                    "Danilo Queiroz",
                    "https://ibb.co/qC1wszp",
                    "https://youtu.be/I62etBwtONg"
                )
            )

            list.add(
                Live(
                    "#Bloco Resenha - Tá Vendo Aquela Lua",
                    "Danilo Queiroz",
                    "https://ibb.co/X38kMqh",
                    "https://youtu.be/8yd7qYGwOnQ"
                )
            )

            list.add(
                Live(
                    "#Marília Mendonça - Troca de Calçada",
                    "Danilo Queiroz",
                    "https://ibb.co/JR2LkKy",
                    "https://youtu.be/WkYqQctOi9g"
                )
            )

            return list

        }


    }
}