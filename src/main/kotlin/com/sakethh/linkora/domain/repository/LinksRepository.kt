package com.sakethh.linkora.domain.repository

import com.sakethh.linkora.domain.Link
import com.sakethh.linkora.domain.dto.link.*
import com.sakethh.linkora.utils.Result

interface LinksRepository {
    suspend fun createANewLink(addLinkDTO: AddLinkDTO): Result<NewItemResponseDTO>
    suspend fun deleteALink(deleteALinkDTO: DeleteALinkDTO): Result<Message>
    suspend fun deleteLinksOfAFolder(folderId: Long): Result<Message>
    suspend fun updateLinkedFolderIdOfALink(updateLinkedFolderIDDto: UpdateLinkedFolderIDDto): Result<Message>
    suspend fun updateTitleOfTheLink(updateTitleOfTheLinkDTO: UpdateTitleOfTheLinkDTO): Result<Message>
    suspend fun updateNote(updateNoteOfALinkDTO: UpdateNoteOfALinkDTO): Result<Message>
    suspend fun updateUserAgent(updateLinkUserAgentDTO: UpdateLinkUserAgentDTO): Result<Message>
    suspend fun archiveALink(linkId:Long): Result<Message>
    suspend fun unArchiveALink(linkId:Long): Result<Message>
    suspend fun markALinkAsImp(linkId: Long):Result<Message>
    suspend fun markALinkAsNonImp(linkId: Long):Result<Message>
    suspend fun updateLink(link: Link):Result<Message>
}