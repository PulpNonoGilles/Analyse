/*==============================================================*/
/* Nom de SGBD :  ORACLE Version 11g                            */
/* Date de création :  18/02/2014 17:26:35                      */
/*==============================================================*/


alter table "Billet"
   drop constraint FK_BILLET_ACHETE___CLIENT;

alter table "Billet"
   drop constraint FK_BILLET_CONCERNE__CODE_PRO;

alter table "Billet"
   drop constraint FK_BILLET_CONCERNE__MATCH;

alter table "Billet"
   drop constraint FK_BILLET_CONCERNE__PLACE;

alter table "Client"
   drop constraint FK_CLIENT_POSSEDE___LICENCE;

alter table "Code_Promotionnel"
   drop constraint FK_CODE_PRO_UTILISE___CLIENT;

alter table "Joueur"
   drop constraint FK_JOUEUR___COMPORT_EQUIPE;

alter table "Licence"
   drop constraint FK_LICENCE_POSSEDE___CLIENT;

alter table "Match"
   drop constraint FK_MATCH___SE_DERO_COURT;

alter table "Place"
   drop constraint FK_PLACE_CONCERNE__BILLET;

alter table "joue__"
   drop constraint FK_JOUE___JOUE___EQUIPE;

alter table "joue__"
   drop constraint FK_JOUE___JOUE___MATCH;

alter table "juge__"
   drop constraint FK_JUGE___JUGE___ARBITRE;

alter table "juge__"
   drop constraint FK_JUGE___JUGE___MATCH;

alter table "participe__"
   drop constraint FK_PARTICIP_PARTICIPE_MATCH;

alter table "participe__"
   drop constraint FK_PARTICIP_PARTICIPE_RAMASSEU;

alter table "reserve__"
   drop constraint FK_RESERVE__RESERVE___COURT;

alter table "reserve__"
   drop constraint FK_RESERVE__RESERVE___JOUEUR;

drop table "Arbitre" cascade constraints;

drop index CONCERNE___FK3;

drop index CONCERNE___FK2;

drop index CONCERNE___FK;

drop index ACHETE___FK;

drop table "Billet" cascade constraints;

drop index POSSEDE___FK;

drop table "Client" cascade constraints;

drop index UTILISE___FK;

drop table "Code_Promotionnel" cascade constraints;

drop table "Court" cascade constraints;

drop table "Equipe" cascade constraints;

drop index __COMPORTE_FK;

drop table "Joueur" cascade constraints;

drop index POSSEDE___FK2;

drop table "Licence" cascade constraints;

drop index __SE_DEROULE_FK;

drop table "Match" cascade constraints;

drop table "Organisateur" cascade constraints;

drop index CONCERNE___FK4;

drop table "Place" cascade constraints;

drop table "Ramasseur_de_balles" cascade constraints;

drop index JOUE___FK2;

drop index JOUE___FK;

drop table "joue__" cascade constraints;

drop index JUGE___FK2;

drop index JUGE___FK;

drop table "juge__" cascade constraints;

drop index PARTICIPE___FK2;

drop index PARTICIPE___FK;

drop table "participe__" cascade constraints;

drop index RESERVE___FK2;

drop index RESERVE___FK;

drop table "reserve__" cascade constraints;

/*==============================================================*/
/* Table : "Arbitre"                                            */
/*==============================================================*/
create table "Arbitre" 
(
   "numArbitre"         INTEGER              not null,
   "nom"                VARCHAR2(254),
   "prenom"             VARCHAR2(254),
   "date_de_naissance"  DATE,
   "categorie"          VARCHAR2(254),
   "nombreArbitrage"    INTEGER,
   constraint PK_ARBITRE primary key ("numArbitre")
);

/*==============================================================*/
/* Table : "Billet"                                             */
/*==============================================================*/
create table "Billet" 
(
   "numBillet"          INTEGER              not null,
   "numCode"            INTEGER,
   "numClient"          INTEGER,
   "codePlace"          VARCHAR2(254)        not null,
   "numMatch"           INTEGER              not null,
   "type"               VARCHAR2(254),
   "prix"               FLOAT,
   constraint PK_BILLET primary key ("numBillet")
);

/*==============================================================*/
/* Index : ACHETE___FK                                          */
/*==============================================================*/
create index ACHETE___FK on "Billet" (
   "numClient" ASC
);

/*==============================================================*/
/* Index : CONCERNE___FK                                        */
/*==============================================================*/
create index CONCERNE___FK on "Billet" (
   "numCode" ASC
);

/*==============================================================*/
/* Index : CONCERNE___FK2                                       */
/*==============================================================*/
create index CONCERNE___FK2 on "Billet" (
   "codePlace" ASC
);

/*==============================================================*/
/* Index : CONCERNE___FK3                                       */
/*==============================================================*/
create index CONCERNE___FK3 on "Billet" (
   "numMatch" ASC
);

/*==============================================================*/
/* Table : "Client"                                             */
/*==============================================================*/
create table "Client" 
(
   "numClient"          INTEGER              not null,
   "NumeroDeLicence"    INTEGER,
   "nom"                VARCHAR2(254),
   "prenom"             VARCHAR2(254),
   "date_de_naissance"  DATE,
   constraint PK_CLIENT primary key ("numClient")
);

/*==============================================================*/
/* Index : POSSEDE___FK                                         */
/*==============================================================*/
create index POSSEDE___FK on "Client" (
   "NumeroDeLicence" ASC
);

/*==============================================================*/
/* Table : "Code_Promotionnel"                                  */
/*==============================================================*/
create table "Code_Promotionnel" 
(
   "numCode"            INTEGER              not null,
   "numClient"          INTEGER,
   "active"             SMALLINT,
   constraint PK_CODE_PROMOTIONNEL primary key ("numCode")
);

/*==============================================================*/
/* Index : UTILISE___FK                                         */
/*==============================================================*/
create index UTILISE___FK on "Code_Promotionnel" (
   "numClient" ASC
);

/*==============================================================*/
/* Table : "Court"                                              */
/*==============================================================*/
create table "Court" 
(
   "numCourt"           INTEGER              not null,
   constraint PK_COURT primary key ("numCourt")
);

/*==============================================================*/
/* Table : "Equipe"                                             */
/*==============================================================*/
create table "Equipe" 
(
   "numEquipe"          INTEGER              not null,
   constraint PK_EQUIPE primary key ("numEquipe")
);

/*==============================================================*/
/* Table : "Joueur"                                             */
/*==============================================================*/
create table "Joueur" 
(
   "numLicence"         INTEGER              not null,
   "numEquipe"          INTEGER              not null,
   "nom"                VARCHAR2(254),
   "prenom"             VARCHAR2(254),
   "date_de_naissance"  DATE,
   "qualifie"           SMALLINT,
   constraint PK_JOUEUR primary key ("numLicence")
);

/*==============================================================*/
/* Index : __COMPORTE_FK                                        */
/*==============================================================*/
create index __COMPORTE_FK on "Joueur" (
   "numEquipe" ASC
);

/*==============================================================*/
/* Table : "Licence"                                            */
/*==============================================================*/
create table "Licence" 
(
   "NumeroDeLicence"    INTEGER              not null,
   "numClient"          INTEGER              not null,
   constraint PK_LICENCE primary key ("NumeroDeLicence")
);

/*==============================================================*/
/* Index : POSSEDE___FK2                                        */
/*==============================================================*/
create index POSSEDE___FK2 on "Licence" (
   "numClient" ASC
);

/*==============================================================*/
/* Table : "Match"                                              */
/*==============================================================*/
create table "Match" 
(
   "numMatch"           INTEGER              not null,
   "numCourt"           INTEGER              not null,
   "date"               DATE,
   "heure"              VARCHAR2(254),
   "type"               VARCHAR2(254),
   constraint PK_MATCH primary key ("numMatch")
);

/*==============================================================*/
/* Index : __SE_DEROULE_FK                                      */
/*==============================================================*/
create index __SE_DEROULE_FK on "Match" (
   "numCourt" ASC
);

/*==============================================================*/
/* Table : "Organisateur"                                       */
/*==============================================================*/
create table "Organisateur" 
(
   "nom"                VARCHAR2(254),
   "prenom"             VARCHAR2(254),
   "date_de_naissance"  DATE
);

/*==============================================================*/
/* Table : "Place"                                              */
/*==============================================================*/
create table "Place" 
(
   "codePlace"          VARCHAR2(254)        not null,
   "numBillet"          INTEGER,
   constraint PK_PLACE primary key ("codePlace")
);

/*==============================================================*/
/* Index : CONCERNE___FK4                                       */
/*==============================================================*/
create index CONCERNE___FK4 on "Place" (
   "numBillet" ASC
);

/*==============================================================*/
/* Table : "Ramasseur_de_balles"                                */
/*==============================================================*/
create table "Ramasseur_de_balles" 
(
   "numRamasseur"       INTEGER              not null,
   "nom"                VARCHAR2(254),
   "prenom"             VARCHAR2(254),
   "date_de_naissance"  DATE,
   constraint PK_RAMASSEUR_DE_BALLES primary key ("numRamasseur")
);

/*==============================================================*/
/* Table : "joue__"                                             */
/*==============================================================*/
create table "joue__" 
(
   "numEquipe"          INTEGER              not null,
   "numMatch"           INTEGER              not null,
   constraint PK_JOUE__ primary key ("numEquipe", "numMatch")
);

/*==============================================================*/
/* Index : JOUE___FK                                            */
/*==============================================================*/
create index JOUE___FK on "joue__" (
   "numEquipe" ASC
);

/*==============================================================*/
/* Index : JOUE___FK2                                           */
/*==============================================================*/
create index JOUE___FK2 on "joue__" (
   "numMatch" ASC
);

/*==============================================================*/
/* Table : "juge__"                                             */
/*==============================================================*/
create table "juge__" 
(
   "numArbitre"         INTEGER              not null,
   "numMatch"           INTEGER              not null,
   constraint PK_JUGE__ primary key ("numArbitre", "numMatch")
);

/*==============================================================*/
/* Index : JUGE___FK                                            */
/*==============================================================*/
create index JUGE___FK on "juge__" (
   "numArbitre" ASC
);

/*==============================================================*/
/* Index : JUGE___FK2                                           */
/*==============================================================*/
create index JUGE___FK2 on "juge__" (
   "numMatch" ASC
);

/*==============================================================*/
/* Table : "participe__"                                        */
/*==============================================================*/
create table "participe__" 
(
   "numRamasseur"       INTEGER              not null,
   "numMatch"           INTEGER              not null,
   constraint PK_PARTICIPE__ primary key ("numRamasseur", "numMatch")
);

/*==============================================================*/
/* Index : PARTICIPE___FK                                       */
/*==============================================================*/
create index PARTICIPE___FK on "participe__" (
   "numRamasseur" ASC
);

/*==============================================================*/
/* Index : PARTICIPE___FK2                                      */
/*==============================================================*/
create index PARTICIPE___FK2 on "participe__" (
   "numMatch" ASC
);

/*==============================================================*/
/* Table : "reserve__"                                          */
/*==============================================================*/
create table "reserve__" 
(
   "numLicence"         INTEGER              not null,
   "numCourt"           INTEGER              not null,
   constraint PK_RESERVE__ primary key ("numLicence", "numCourt")
);

/*==============================================================*/
/* Index : RESERVE___FK                                         */
/*==============================================================*/
create index RESERVE___FK on "reserve__" (
   "numLicence" ASC
);

/*==============================================================*/
/* Index : RESERVE___FK2                                        */
/*==============================================================*/
create index RESERVE___FK2 on "reserve__" (
   "numCourt" ASC
);

alter table "Billet"
   add constraint FK_BILLET_ACHETE___CLIENT foreign key ("numClient")
      references "Client" ("numClient");

alter table "Billet"
   add constraint FK_BILLET_CONCERNE__CODE_PRO foreign key ("numCode")
      references "Code_Promotionnel" ("numCode");

alter table "Billet"
   add constraint FK_BILLET_CONCERNE__MATCH foreign key ("numMatch")
      references "Match" ("numMatch");

alter table "Billet"
   add constraint FK_BILLET_CONCERNE__PLACE foreign key ("codePlace")
      references "Place" ("codePlace");

alter table "Client"
   add constraint FK_CLIENT_POSSEDE___LICENCE foreign key ("NumeroDeLicence")
      references "Licence" ("NumeroDeLicence");

alter table "Code_Promotionnel"
   add constraint FK_CODE_PRO_UTILISE___CLIENT foreign key ("numClient")
      references "Client" ("numClient");

alter table "Joueur"
   add constraint FK_JOUEUR___COMPORT_EQUIPE foreign key ("numEquipe")
      references "Equipe" ("numEquipe");

alter table "Licence"
   add constraint FK_LICENCE_POSSEDE___CLIENT foreign key ("numClient")
      references "Client" ("numClient");

alter table "Match"
   add constraint FK_MATCH___SE_DERO_COURT foreign key ("numCourt")
      references "Court" ("numCourt");

alter table "Place"
   add constraint FK_PLACE_CONCERNE__BILLET foreign key ("numBillet")
      references "Billet" ("numBillet");

alter table "joue__"
   add constraint FK_JOUE___JOUE___EQUIPE foreign key ("numEquipe")
      references "Equipe" ("numEquipe");

alter table "joue__"
   add constraint FK_JOUE___JOUE___MATCH foreign key ("numMatch")
      references "Match" ("numMatch");

alter table "juge__"
   add constraint FK_JUGE___JUGE___ARBITRE foreign key ("numArbitre")
      references "Arbitre" ("numArbitre");

alter table "juge__"
   add constraint FK_JUGE___JUGE___MATCH foreign key ("numMatch")
      references "Match" ("numMatch");

alter table "participe__"
   add constraint FK_PARTICIP_PARTICIPE_MATCH foreign key ("numMatch")
      references "Match" ("numMatch");

alter table "participe__"
   add constraint FK_PARTICIP_PARTICIPE_RAMASSEU foreign key ("numRamasseur")
      references "Ramasseur_de_balles" ("numRamasseur");

alter table "reserve__"
   add constraint FK_RESERVE__RESERVE___COURT foreign key ("numCourt")
      references "Court" ("numCourt");

alter table "reserve__"
   add constraint FK_RESERVE__RESERVE___JOUEUR foreign key ("numLicence")
      references "Joueur" ("numLicence");

