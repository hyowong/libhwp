package com.tang.hwplib.builder.template.emptydocument.docinfo

import com.tang.hwplib.builder.docinfo.HWPNumberingBuilder
import com.tang.hwplib.builder.docinfo.numbering.HWPLevelNumberingBuilder
import com.tang.hwplib.builder.docinfo.numbering.HWPParagraphHeadInfoBuilder
import com.tang.hwplib.builder.docinfo.numbering.HWPParagraphHeadInfoPropertyBuilder
import com.tang.hwplib.builder.etc.HWPDocInfoBuilderType
import com.tang.hwplib.objects.docinfo.HWPDocInfo

class HWPEmptyNumberingBuilder {
    fun build(docInfo: HWPDocInfo) {
        val builder : HWPNumberingBuilder = docInfo.getBuilder(HWPDocInfoBuilderType.Numbering) as HWPNumberingBuilder
        builder.setLevelNumbering(0, HWPLevelNumberingBuilder()
                .setParagraphHeadInfo(HWPParagraphHeadInfoBuilder(docInfo)
                        .setProperty(HWPParagraphHeadInfoPropertyBuilder().setValue(12))
                        .setCorrectionValueForWidth(0)
                        .setDistanceFromBody(50)
                        .setCharShapeID(-1))
                .setNumberFormat("^1."))
                .setLevelNumbering(1, HWPLevelNumberingBuilder()
                        .setParagraphHeadInfo(HWPParagraphHeadInfoBuilder(docInfo)
                                .setProperty(HWPParagraphHeadInfoPropertyBuilder().setValue(268))
                                .setCorrectionValueForWidth(0)
                                .setDistanceFromBody(50)
                                .setCharShapeID(-1))
                        .setNumberFormat("^2."))
                .setLevelNumbering(2, HWPLevelNumberingBuilder()
                        .setParagraphHeadInfo(HWPParagraphHeadInfoBuilder(docInfo)
                                .setProperty(HWPParagraphHeadInfoPropertyBuilder().setValue(12))
                                .setCorrectionValueForWidth(0)
                                .setDistanceFromBody(50)
                                .setCharShapeID(-1))
                        .setNumberFormat("^3)"))
                .setLevelNumbering(3, HWPLevelNumberingBuilder()
                        .setParagraphHeadInfo(HWPParagraphHeadInfoBuilder(docInfo)
                                .setProperty(HWPParagraphHeadInfoPropertyBuilder().setValue(268))
                                .setCorrectionValueForWidth(0)
                                .setDistanceFromBody(50)
                                .setCharShapeID(-1))
                        .setNumberFormat("^4)"))
                .setLevelNumbering(4, HWPLevelNumberingBuilder()
                        .setParagraphHeadInfo(HWPParagraphHeadInfoBuilder(docInfo)
                                .setProperty(HWPParagraphHeadInfoPropertyBuilder().setValue(12))
                                .setCorrectionValueForWidth(0)
                                .setDistanceFromBody(50)
                                .setCharShapeID(-1))
                        .setNumberFormat("(^5)"))
                .setLevelNumbering(5, HWPLevelNumberingBuilder()
                        .setParagraphHeadInfo(HWPParagraphHeadInfoBuilder(docInfo)
                                .setProperty(HWPParagraphHeadInfoPropertyBuilder().setValue(268))
                                .setCorrectionValueForWidth(0)
                                .setDistanceFromBody(50)
                                .setCharShapeID(-1))
                        .setNumberFormat("(^6)"))
                .setLevelNumbering(6, HWPLevelNumberingBuilder()
                        .setParagraphHeadInfo(HWPParagraphHeadInfoBuilder(docInfo)
                                .setProperty(HWPParagraphHeadInfoPropertyBuilder().setValue(44))
                                .setCorrectionValueForWidth(0)
                                .setDistanceFromBody(50)
                                .setCharShapeID(-1))
                        .setNumberFormat("^7"))
                .setStartNumber(0)
                .setStartNumberForLevel(0, 1)
                .setStartNumberForLevel(1, 1)
                .setStartNumberForLevel(2, 1)
                .setStartNumberForLevel(3, 1)
                .setStartNumberForLevel(4, 1)
                .setStartNumberForLevel(5, 1)
                .setStartNumberForLevel(6, 1)
                .build()
    }
}