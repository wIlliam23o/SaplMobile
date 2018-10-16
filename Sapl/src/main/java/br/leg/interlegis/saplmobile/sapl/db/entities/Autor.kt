package br.leg.interlegis.saplmobile.sapl.db.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "autor")
class Autor constructor(uid: Int,
                         nome: String,
                         fotografia: String,
                         file_date_updated: Date? = null) {


    @PrimaryKey
    var uid: Int = uid
    var nome: String = nome
    var fotografia: String = fotografia
    var file_date_updated: Date? = file_date_updated
}

