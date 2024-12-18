package com.sakethh.linkora.domain.handler

import com.sakethh.linkora.domain.tables.LinksTable
import com.sakethh.linkora.domain.tables.LinksTombstone
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import java.time.Instant
import java.time.format.DateTimeFormatter

object LinksTombstoneHandler {
    fun LinksTombstone.insert(resultRow: ResultRow) {
        this.insert { insert ->
            insert[lastModified] = DateTimeFormatter.ISO_INSTANT.format(Instant.now())
            insert[infoForSaving] = resultRow[LinksTable.infoForSaving]
            insert[lastModified] = DateTimeFormatter.ISO_INSTANT.format(Instant.now())
            insert[originId] = resultRow[LinksTable.id]
            insert[linkType] = resultRow[LinksTable.linkType]
            insert[linkTitle] = resultRow[LinksTable.linkTitle]
            insert[webURL] = resultRow[LinksTable.webURL]
            insert[baseURL] = resultRow[LinksTable.baseURL]
            insert[imgURL] = resultRow[LinksTable.imgURL]
            insert[isLinkedWithSavedLinks] = resultRow[LinksTable.isLinkedWithSavedLinks]
            insert[isLinkedWithFolders] = resultRow[LinksTable.isLinkedWithFolders]
            insert[idOfLinkedFolder] = resultRow[LinksTable.idOfLinkedFolder]
            insert[userAgent] = resultRow[LinksTable.userAgent]
        }
    }
}