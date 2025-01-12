package org.example.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Module2035DepsEnum {
    MIXED_CHARGES(
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC03",
            "OGBNC04",
            "MADELIN",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    IMMO_GAIN_LOSS(
            "EXEMPTIONS_AND_ALLOWANCES",
            "MADELIN",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    DIVERS_DEDUCTION_REINSTATEMENT(
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC02",
            "OGBNC03",
            "OGBNC04",
            "MADELIN",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    MADELIN(
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC03",
            "OGBNC04",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    EXEMPTIONS_AND_ALLOWANCES(
            "SCP_SISA_ASSOCIATE_REPARTITION",
            "FORM_SUBMIT"
    ),

    F3(
            "DIVERS_DEDUCTION_REINSTATEMENT",
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC02",
            "OGBNC04",
            "MADELIN",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    PER_AND_ABUNDANTLY(
            "MADELIN",
            "DIVERS_DEDUCTION_REINSTATEMENT",
            "SCP_SISA_ASSOCIATE_REPARTITION",
            "FORM_SUBMIT"
    ),

    MEDICAL_EXEMPTION(
            "DIVERS_DEDUCTION_REINSTATEMENT",
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC02",
            "OGBNC04",
            "MADELIN",
            "F3",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    DEDUCTION_COVID(
            "DIVERS_DEDUCTION_REINSTATEMENT",
            "OGBNC02",
            "EXEMPTIONS_AND_ALLOWANCES",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    ACCOUNTING_FEES_TAX_CREDIT(
            "EXEMPTIONS_AND_ALLOWANCES",
            "DIVERS_DEDUCTION_REINSTATEMENT",
            "MADELIN",
            "OGBNC03",
            "FORM_SUBMIT"
    ),
    FAMILY_TAX_CREDIT("FORM_SUBMIT"),

    CNBF("FORM_SUBMIT"),

    BIC(
            "MIXED_CHARGES",
            "FORM_SUBMIT"
    ),

    AGA_INFO(
            "OGID00",
            "OGBNC00",
            "OGBNC01",
            "OGBNC02",
            "OGBNC03",
            "OGBNC04",
            "OGBNC05_TO_08",
            "FORM_SUBMIT"
    ),

    URSSAF(
            "OGBNC03",
            "OGBNC04",
            "EXEMPTIONS_AND_ALLOWANCES"
    ),


    MEAL_TAKEN_ALONE(
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC03",
            "OGBNC04",
            "MADELIN",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    SCM_SPENDING(
            "MIXED_CHARGES",
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC04",
            "MADELIN"
    ),

    LEASING_VEHICLES(
            "MIXED_CHARGES",
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC03",
            "OGBNC04",
            "MADELIN",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    DONATIONS_AND_SPONSORSHIP(
            "EXEMPTIONS_AND_ALLOWANCES",
            "OGBNC04",
            "MADELIN",
            "SCP_SISA_ASSOCIATE_REPARTITION",
            "FORM_SUBMIT"
    ),

    F2(
            "EXEMPTIONS_AND_ALLOWANCES",
            "DIVERS_DEDUCTION_REINSTATEMENT",
            "OGBNC02",
            "OGBNC04",
            "MADELIN",
            "SCP_SISA_ASSOCIATE_REPARTITION"
    ),

    TAX_CREDIT_FORMATION("FORM_SUBMIT");

    private final List<String> deps;

    Module2035DepsEnum(String ...deps) {
        this.deps = Arrays.asList(deps);
    }

    public List<String> getDeps() {
        return deps;
    }
}


class OrderModule2035ByStep {
    public enum VALIDATION {
        VAT_STATEMENT_CONTROL,
        USER_INFORMATION,
        ASSOCIATES_CONTROLS,
        PREVIOUS_ACCOUNTING_BALANCE,
        SALARIES,
        BANK_TRANSACTIONS,
        SPECIFIC_CONTROLS,
        VAT,
        AGA_INFO,
        CESSATION_OF_ACTIVITY_IMMOBILIZATION,
        VEHICLE;
    }

    public enum SCM {
        SCM_INFORMATION,
        SCM_SPENDING
    }

    public enum YEAR_END_RESTATEMENTS {
        URSSAF,
        CNBF,
        DEDUCTION_COVID,
        MEAL_TAKEN_ALONE,
        BIC,
        LEASING_VEHICLES,
        DONATIONS_AND_SPONSORSHIP,
        TAX_CREDIT_FORMATION,
        FAMILY_TAX_CREDIT,
        ACCOUNTING_FEES_TAX_CREDIT,
        F2,
        MEDICAL_EXEMPTION,
        F3,
        MIXED_CHARGES,
        IMMO_GAIN_LOSS,
        DIVERS_DEDUCTION_REINSTATEMENT,
        PER_AND_ABUNDANTLY,
        MADELIN,
        EXEMPTIONS_AND_ALLOWANCES,
        ADDITIONAL_INFORMATION_2035E,
        ADDITIONAL_INFO_WITHHOLDING_TAX,
        SCP_SISA_ASSOCIATE_REPARTITION
    }

    public enum OGBNC {
        OGID00,
        OGBNC00,
        OGBNC01,
        OGBNC02,
        OGBNC03,
        OGBNC04,
        OGBNC05_TO_08
    }

    public enum SUMMARY_AND_SENDING {
        FORM_SUBMIT
    }

    public enum REVISION_EC {
        REVISION_EC_INFO,
        REVISION_EC_CASH_AND_LOANS,
        REVISION_EC_IMMOBILIZATION,
        REVISION_EC_PURCHASES,
        REVISION_EC_SALARIES_SOCIAL_CHARGES_TAX,
        REVISION_EC_SALES_AND_MISCELLANEOUS_GAINS,
        REVISION_EC_DEDUCTION_REINSTATEMENT_TAX
    }

}

public enum Module2035TypeEnum {
    /* 0  */ USER_INFORMATION(
            "Informations",
            "",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.USER_INFORMATION,
            Module2035StepTypeEnum.MODULE_2035

    ),
    /* 1  */ BANK_TRANSACTIONS(
            "Transactions bancaires et soldes de trésorerie",
            "Vérifiez dans ce module les transactions et les soldes de trésorerie à la date de votre déclaration 2035.",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.BANK_TRANSACTIONS,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 2  */ URSSAF(
            "Retraitements URSSAF",
            "Procédez dans ce module aux retraitements de CSG non déductible, de Contribution à la Formation Professionnelle (CFP) et de Contribution aux Unions Régionales des Professionnels de Santé (CURPS)",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.URSSAF,
            Module2035DepsEnum.URSSAF,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_URSSAF)

    ),
    /* 3  */ MEAL_TAKEN_ALONE(
            "Repas pris seul",
            "Procédez dans ce module au retraitement de la part non déductible relative aux dépenses de repas pris seul ",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.MEAL_TAKEN_ALONE,
            Module2035DepsEnum.MEAL_TAKEN_ALONE,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_MEAL_TAKEN_ALONE)
    ),
    /* 4  */ SCM_INFORMATION(
            "Informations SCM",
            "Saisissez dans ce module les éléments issus du cadre V de la déclaration 2036 (Etat détaillé des dépenses réparties entre les associés des sociétés civiles de moyens) de la SCM dont vous êtes associé(e)",
            Module2035StepEnum.SCM,
            OrderModule2035ByStep.SCM.SCM_INFORMATION,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 5  */ SCM_SPENDING(
            "Remontée des charges SCM",
            "Saisissez dans ce module les éléments issus du cadre V de la déclaration 2036 (Etat détaillé des dépenses réparties entre les associés des sociétés civiles de moyens) de la SCM dont vous êtes associé(e)",
            Module2035StepEnum.SCM,
            OrderModule2035ByStep.SCM.SCM_SPENDING,
            Module2035DepsEnum.SCM_SPENDING,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_SCM_SPENDING)
    ),
    /* 5  */ LEASING_VEHICLES(
            "Plafonnement des leasings véhicules",
            "Retraitez dans ce module la part non déductible de vos leasings véhicules (information communiquée annuellement par votre organisme de leasing)",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.LEASING_VEHICLES,
            Module2035DepsEnum.LEASING_VEHICLES,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_LEASING_VEHICLES)
    ),
    /* 7  */ OGID00(
            "OGID00",
            "Renseignez dans ce module la fiche d’identification pour l’AGA.",
            Module2035StepEnum.OG_BNC,
            OrderModule2035ByStep.OGBNC.OGID00,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 8  */ OGBNC00(
            "OGBNC00",
            "Renseignez dans ce module la déclaration du professionnel de l’expertise comptable.",
            Module2035StepEnum.OG_BNC,
            OrderModule2035ByStep.OGBNC.OGBNC00,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 9  */ OGBNC05_TO_08(
            "OGBNC 05 à 08",
            "",
            Module2035StepEnum.OG_BNC,
            OrderModule2035ByStep.OGBNC.OGBNC05_TO_08,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 10 */ DONATIONS_AND_SPONSORSHIP(
            "Dons et mécénat",
            "Retraitez fiscalement dans ce module les dons faits au cours de l’année",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.DONATIONS_AND_SPONSORSHIP,
            Module2035DepsEnum.DONATIONS_AND_SPONSORSHIP,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_DONATIONS_AND_SPONSORSHIP)
    ),
    /* 11 */ TAX_CREDIT_FORMATION(
            "Crédit d'impôt formation des dirigeants d'entreprise",
            "Intégrez via ce module un éventuel crédit d'impôt formation des dirigeants d'entreprise",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.TAX_CREDIT_FORMATION,
            Module2035DepsEnum.TAX_CREDIT_FORMATION,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 12 */ F2(
            "Forfait 2%",
            "Validez dans ce module le montant du forfait 2% ; celui-ci se retrouvera à la case 43-CQ de la déclaration 2035.",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.F2,
            Module2035DepsEnum.F2,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_F2)
    ),
    /* 13 */ MIXED_CHARGES(
            "Frais mixtes",
            "Retraitez dans ce module les dépenses ayant à la fois un caractère personnel et professionnel",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.MIXED_CHARGES,
            Module2035DepsEnum.MIXED_CHARGES,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_MIXED_CHARGES)
    ),
    /* 14 */ OGBNC04(
            "OGBNC04 - Tableau de passage",
            "Finalisez dans ce module le tableau de passage à l’Organisme de Gestion",
            Module2035StepEnum.OG_BNC,
            OrderModule2035ByStep.OGBNC.OGBNC04,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 15 */ FORM_SUBMIT(
            "Projet de déclaration",
            "",
            Module2035StepEnum.SUMMARY_AND_SENDING,
            OrderModule2035ByStep.SUMMARY_AND_SENDING.FORM_SUBMIT,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 16 */ OGBNC03(
            "OGBNC03",
            "Renseignez dans ce module les frais mixtes faisant l’objet d’une réintégration fiscale.",
            Module2035StepEnum.OG_BNC,
            OrderModule2035ByStep.OGBNC.OGBNC03,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 17 */ IMMO_GAIN_LOSS(
            "Plus et Moins values",
            "Retraitez dans ce module les plus et moins-values comptables de l’exercice",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.IMMO_GAIN_LOSS,
            Module2035DepsEnum.IMMO_GAIN_LOSS,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_IMMO_GAIN_LOSS_SHORT_TERM, OdTypeEnum.MODULE_2035_IMMO_GAIN_LOSS_LONG_TERM)
    ),
    /* 18 */ DIVERS_DEDUCTION_REINSTATEMENT(
            "Déductions / Réintégrations diverses",
            "Renseignez ici les déductions et réintégrations diverses non traitées dans les autres modules",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.DIVERS_DEDUCTION_REINSTATEMENT,
            Module2035DepsEnum.DIVERS_DEDUCTION_REINSTATEMENT,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_DIVERS_DEDUCTION_REINSTATEMENT)
    ),
    /* 19 */ MADELIN(
            "Plafonnement contrats Madelin",
            "Retraitez dans ce module les cotisations versées sur vos contrats Madelin",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.MADELIN,
            Module2035DepsEnum.MADELIN,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_MADELIN)
    ),
    /* 20 */ SALARIES(
            "Salaires perçus et personnel salarié",
            "Saisissez dans ce module les informations relatives aux salaires que vous avez perçus et à votre personnel salarié",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.SALARIES,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 21 */ EXEMPTIONS_AND_ALLOWANCES(
            "Exonérations et abattements",
            "Saisissez dans ce module les exonérations et abattements fiscaux sur votre résultat",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.EXEMPTIONS_AND_ALLOWANCES,
            Module2035DepsEnum.EXEMPTIONS_AND_ALLOWANCES,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_EXEMPTIONS_AND_ALLOWANCES, OdTypeEnum.MODULE_2035_EXEMPTIONS_AND_ALLOWANCES_NEW_BUSINESS)
    ),
    /* 22 */ F3(
            "Forfait 3% / Frais groupe III",
            "Validez ici le montant du forfait 3% et des frais du groupe III",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.F3,
            Module2035DepsEnum.F3,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_F3)
    ),
    /* 23 */ OGBNC02(
            "OGBNC02",
            "Retrouvez ici le détail des déductions diverses pour l’AGA",
            Module2035StepEnum.OG_BNC,
            OrderModule2035ByStep.OGBNC.OGBNC02,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 24 */ OGBNC01(
            "OGBNC01",
            "Renseignez dans ce module la déclaration du professionnel de l’expertise comptable.",
            Module2035StepEnum.OG_BNC,
            OrderModule2035ByStep.OGBNC.OGBNC01,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 25 */ SPECIFIC_CONTROLS(
            "Contrôles spécifiques",
            "Validez dans ce module que certaines dépenses obligatoires sont bien comptabilité. Un solde négatif ou nul nécessite un contrôle et/ou une modification en amont de la comptabilité.",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.SALARIES,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 26 */ PER_AND_ABUNDANTLY(
            "PER et Abondement",
            "Validez dans ce module les montants versés au titre d’un PER ou d’un abondement",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.PER_AND_ABUNDANTLY,
            Module2035DepsEnum.PER_AND_ABUNDANTLY,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_PER, OdTypeEnum.MODULE_2035_PERCO)
    ),
    /* 27 */ PREVIOUS_ACCOUNTING_BALANCE(
            "Antériorité comptable",
            "Validez dans ce module les informations relatives à votre AGA",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.PREVIOUS_ACCOUNTING_BALANCE,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 28 */ AGA_INFO(
            "AGA",
            "Validez dans ce module les informations relatives à votre AGA",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.AGA_INFO,
            Module2035DepsEnum.AGA_INFO,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 29 */ MEDICAL_EXEMPTION(
            "Exonération médecins « zones déficitaires en offre de soins »",
            "Validez ici le montant de l’exonération relative à la permanence des soins exercés dans les zones urbaines ou rurales déficitaires en offre de soins définies telles que définies par les missions régionales de santé.",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.MEDICAL_EXEMPTION,
            Module2035DepsEnum.MEDICAL_EXEMPTION,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_MEDICAL_EXEMPTION)
    ),
    /* 30 */ BIC(
            "Dépenses de carburant",
            "Choisissez dans ce module le mode d'évaluation de vos dépenses professionnelles de carburant",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.BIC,
            Module2035DepsEnum.BIC,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_BIC)
    ),
    /* 31 */ DEDUCTION_COVID(
            "Aides Fonds de solidarité Covid",
            "Procédez dans ce module à la déduction des aides reçues du Fonds de solidarité Covid (généralement enregistrées en “Gains divers”) ; cette déduction se retrouvera à la case 43 - CJ de la déclaration 2035.",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.DEDUCTION_COVID,
            Module2035DepsEnum.DEDUCTION_COVID,
            Module2035StepTypeEnum.MODULE_2035,
            List.of(OdTypeEnum.MODULE_2035_DEDUCTION_COVID)
    ),
    /* 32 */ ADDITIONAL_INFO_WITHHOLDING_TAX(
            "Informations complémentaires - Prélèvement à la source",
            "Saisissez ici les informations complémentaires requises dans votre 2035-SD",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.ADDITIONAL_INFO_WITHHOLDING_TAX,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 33 */ ADDITIONAL_INFORMATION_2035E(
            "Informations complémentaires 2035-E",
            "Saisissez ici les informations complémentaires requises dans votre 2035-E",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.ADDITIONAL_INFORMATION_2035E,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 34*/  SCP_SISA_ASSOCIATE_REPARTITION(
            "Répartition des résultats entre associés",
            "Validez dans ce module la répartition des résultats annuels de votre société ; cette ventilation se retrouvera au “cadre III – RÉPARTITION DES RÉSULTATS ENTRE LES ASSOCIÉS” de la déclaration 2035-SD",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.SCP_SISA_ASSOCIATE_REPARTITION,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 35 */ VAT(
            "TVA",
            "Dans ce module, contrôlez le traitement de la TVA déductible et collectée.",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.VAT,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 36 */ CESSATION_OF_ACTIVITY_IMMOBILIZATION(
            "Cessation d’activité - Immobilisations",
            "Information relative à la clôture des immobilisations dans le cas de cessation d’activité.",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.CESSATION_OF_ACTIVITY_IMMOBILIZATION,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 37 */ CNBF(
            "Retraitement cotisations CNBF",
            "Saisissez ici la part des cotisations CNBF à reclasser en assurance",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.CNBF,
            Module2035DepsEnum.CNBF,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 38 */ VEHICLE(
            "Informations véhicules",
            "",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.VEHICLE,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 39 */ VAT_STATEMENT_CONTROL(
            "Déclarations de TVA",
            "Vérifiez dans ce module que les obligations déclaratives en matière de TVA ont bien été remplies ",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.VAT_STATEMENT_CONTROL,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 40 */ FAMILY_TAX_CREDIT(
            "Crédit impôt famille ",
            "Informations relatives aux dépenses éligibles au crédit impôt famille",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.FAMILY_TAX_CREDIT,
            Module2035DepsEnum.FAMILY_TAX_CREDIT,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 41 */ ASSOCIATES_CONTROLS(
            "Associés",
            "Informations relatives à la détention de la société",
            Module2035StepEnum.VALIDATION,
            OrderModule2035ByStep.VALIDATION.ASSOCIATES_CONTROLS,
            Module2035StepTypeEnum.MODULE_2035
    ),
    /* 42 */ REVISION_EC_INFO(
            "Révision comptable - Informations pré-révision",
            "",
            Module2035StepEnum.REVISION_EC,
            OrderModule2035ByStep.REVISION_EC.REVISION_EC_INFO,
            Module2035StepTypeEnum.REVISION
    ),
    /* 43 */ REVISION_EC_CASH_AND_LOANS(
            "Révision comptable - Cycle Trésorerie & Emprunts",
            "",
            Module2035StepEnum.REVISION_EC,
            OrderModule2035ByStep.REVISION_EC.REVISION_EC_CASH_AND_LOANS,
            Module2035StepTypeEnum.REVISION
    ),
    /* 44 */ REVISION_EC_DEDUCTION_REINSTATEMENT_TAX(
            "Révision comptable - Déductions / Réintégrations fiscales",
            "",
            Module2035StepEnum.REVISION_EC,
            OrderModule2035ByStep.REVISION_EC.REVISION_EC_DEDUCTION_REINSTATEMENT_TAX,
            Module2035StepTypeEnum.REVISION
    ),
    /* 45 */ REVISION_EC_IMMOBILIZATION(
            "Révision comptable - Immobilisations, amortissements et plus/moins-values",
            "",
            Module2035StepEnum.REVISION_EC,
            OrderModule2035ByStep.REVISION_EC.REVISION_EC_IMMOBILIZATION,
            Module2035StepTypeEnum.REVISION
    ),
    /* 46 */ REVISION_EC_SALARIES_SOCIAL_CHARGES_TAX(
            "Révision comptable - Salaires, charges sociales et taxes",
            "",
            Module2035StepEnum.REVISION_EC,
            OrderModule2035ByStep.REVISION_EC.REVISION_EC_SALARIES_SOCIAL_CHARGES_TAX,
            Module2035StepTypeEnum.REVISION
    ),
    /* 47 */ REVISION_EC_PURCHASES(
            "Révision comptable - Achats",
            "",
            Module2035StepEnum.REVISION_EC,
            OrderModule2035ByStep.REVISION_EC.REVISION_EC_PURCHASES,
            Module2035StepTypeEnum.REVISION
    ),
    /* 48 */ REVISION_EC_SALES_AND_MISCELLANEOUS_GAINS(
            "Révision comptable - Ventes & Gains divers",
            "",
            Module2035StepEnum.REVISION_EC,
            OrderModule2035ByStep.REVISION_EC.REVISION_EC_SALES_AND_MISCELLANEOUS_GAINS,
            Module2035StepTypeEnum.REVISION
    ),
    /* 49 */ ACCOUNTING_FEES_TAX_CREDIT(
            "Réduction d’impôt pour frais de tenue de comptabilité",
            "Validez ici le montant du crédit d’impôt inhérent aux frais engagés dans le cadre de la tenue comptable. Ce crédit est égal à un pourcentage des dépenses liées à la tenue comptable et plafonné annuellement selon la réglementation en vigueur.",
            Module2035StepEnum.YEAR_END_RESTATEMENTS,
            OrderModule2035ByStep.YEAR_END_RESTATEMENTS.ACCOUNTING_FEES_TAX_CREDIT,
            Module2035DepsEnum.ACCOUNTING_FEES_TAX_CREDIT,
            Module2035StepTypeEnum.MODULE_2035
    );

    private final String title;
    private final String description;
    private final Module2035StepEnum step;
    private final int order;
    private final List<String> deps;
    private final Module2035StepTypeEnum stepType;
    private final List<OdTypeEnum> odTypes;


    Module2035TypeEnum(String title,
                       String description,
                       Module2035StepEnum step,
                       Enum<?> enumType,
                       Module2035DepsEnum enumDeps,
                       Module2035StepTypeEnum stepType,
                       List<OdTypeEnum> odTypes) {
        this.title = title;
        this.description = description;
        this.step = step;
        this.order = enumType.ordinal();
        this.deps = enumDeps.getDeps();
        this.stepType = stepType;
        this.odTypes = odTypes;
    }

    Module2035TypeEnum(String title,
                       String description,
                       Module2035StepEnum step,
                       Enum<?> enumType,
                       Module2035DepsEnum deps,
                       Module2035StepTypeEnum stepType) {
        this.title = title;
        this.description = description;
        this.step = step;
        this.order = enumType.ordinal();
        this.deps = deps.getDeps();
        this.stepType = stepType;
        this.odTypes = new ArrayList<>();
    }

    Module2035TypeEnum(String title,
                       String description,
                       Module2035StepEnum step,
                       Enum<?> enumType,
                       Module2035StepTypeEnum stepType,
                       List<OdTypeEnum> odTypes) {
        this.title = title;
        this.description = description;
        this.step = step;
        this.order = enumType.ordinal();
        this.stepType = stepType;
        this.odTypes = odTypes;
        this.deps = new ArrayList<>();
    }

    Module2035TypeEnum(String title,
                       String description,
                       Module2035StepEnum step,
                       Enum<?> enumType,
                       Module2035StepTypeEnum stepType) {
        this.title = title;
        this.description = description;
        this.step = step;
        this.order = enumType.ordinal();
        this.stepType = stepType;
        this.odTypes = new ArrayList<>();
        this.deps = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Module2035StepEnum getStep() {
        return step;
    }

    public int getOrder() {
        return order;
    }

    public List<Module2035TypeEnum> getDeps() {
        return deps.stream().map(Module2035TypeEnum::getByName).toList();
    }

    public Module2035StepTypeEnum getStepType() {
        return stepType;
    }

    public List<OdTypeEnum> getOdTypes() {
        return odTypes;
    }

    public static Module2035TypeEnum getByType(Module2035TypeEnum type) {
        return Arrays.stream(values()).filter(t -> t.name().equals(type.name())).findFirst().orElse(null);
    }

    public static Module2035TypeEnum getByName(String name) {
        return Arrays.stream(values()).filter(t -> t.name().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("The argument name is not find name arg : " + name));
    }
}

