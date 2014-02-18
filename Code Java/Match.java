/***********************************************************************
 * Module:  Match.java
 * Author:  p1200886
 * Purpose: Defines the Class Match
 ***********************************************************************/

import java.util.*;

/** @pdOid 5f403ca2-6b70-4300-98b0-c053464d5ace */
public class Match {
   /** @pdOid 5ef8c248-d647-4010-827c-5023bcb63342 */
   private int numMatch;
   /** @pdOid 19fd19bb-18d0-48bc-91df-f63d69172e1c */
   private java.util.Date date;
   /** @pdOid c83ea0df-b911-4e33-a620-56aec0bf720f */
   private String heure;
   /** @pdOid 7cc8e99d-2f6a-41b7-9072-6bc6c4981daf */
   private String type;
   
   /** @pdRoleInfo migr=no name=Billet assc=concerne__ coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Billet> billet;
   /** @pdRoleInfo migr=no name=Court assc=__se_deroule coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public Court court;
   /** @pdRoleInfo migr=no name=Arbitre assc=juge__ coll=java.util.Collection impl=java.util.HashSet mult=10..10 side=A */
   public java.util.Collection<Arbitre> arbitre;
   /** @pdRoleInfo migr=no name=Ramasseur_de_balles assc=participe__ coll=java.util.Collection impl=java.util.HashSet mult=12..12 side=A */
   public java.util.Collection<Ramasseur_de_balles> ramasseur_de_balles;
   /** @pdRoleInfo migr=no name=Equipe assc=joue__ coll=java.util.Collection impl=java.util.HashSet mult=2..2 side=A */
   public java.util.Collection<Equipe> equipe;
   
   /** @pdOid 76d6632a-2bb4-4d7f-ae22-1c11c89f0906 */
   public void inserer() {
      // TODO: implement
   }
   
   /** @pdOid 5a4fbc23-5b68-496e-af58-9398732bc215 */
   public void modifier() {
      // TODO: implement
   }
   
   /** @pdOid 7b7fb651-a121-4fbd-af8e-4c34175c26d5 */
   public void supprimer() {
      // TODO: implement
   }
   
   /** @pdOid 964a7fdc-a6b0-4b6a-b819-3b85afe461b6 */
   public void deplacer() {
      // TODO: implement
   }
   
   /** @pdOid 9f652d57-00cd-4ba5-84f3-09f6a5d95bcf */
   public void AffecterArbitre() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Billet> getBillet() {
      if (billet == null)
         billet = new java.util.HashSet<Billet>();
      return billet;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBillet() {
      if (billet == null)
         billet = new java.util.HashSet<Billet>();
      return billet.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBillet */
   public void setBillet(java.util.Collection<Billet> newBillet) {
      removeAllBillet();
      for (java.util.Iterator iter = newBillet.iterator(); iter.hasNext();)
         addBillet((Billet)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBillet */
   public void addBillet(Billet newBillet) {
      if (newBillet == null)
         return;
      if (this.billet == null)
         this.billet = new java.util.HashSet<Billet>();
      if (!this.billet.contains(newBillet))
      {
         this.billet.add(newBillet);
         newBillet.setMatch(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBillet */
   public void removeBillet(Billet oldBillet) {
      if (oldBillet == null)
         return;
      if (this.billet != null)
         if (this.billet.contains(oldBillet))
         {
            this.billet.remove(oldBillet);
            oldBillet.setMatch((Match)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBillet() {
      if (billet != null)
      {
         Billet oldBillet;
         for (java.util.Iterator iter = getIteratorBillet(); iter.hasNext();)
         {
            oldBillet = (Billet)iter.next();
            iter.remove();
            oldBillet.setMatch((Match)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Court getCourt() {
      return court;
   }
   
   /** @pdGenerated default parent setter
     * @param newCourt */
   public void setCourt(Court newCourt) {
      if (this.court == null || !this.court.equals(newCourt))
      {
         if (this.court != null)
         {
            Court oldCourt = this.court;
            this.court = null;
            oldCourt.removeMatch(this);
         }
         if (newCourt != null)
         {
            this.court = newCourt;
            this.court.addMatch(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Arbitre> getArbitre() {
      if (arbitre == null)
         arbitre = new java.util.HashSet<Arbitre>();
      return arbitre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorArbitre() {
      if (arbitre == null)
         arbitre = new java.util.HashSet<Arbitre>();
      return arbitre.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newArbitre */
   public void setArbitre(java.util.Collection<Arbitre> newArbitre) {
      removeAllArbitre();
      for (java.util.Iterator iter = newArbitre.iterator(); iter.hasNext();)
         addArbitre((Arbitre)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newArbitre */
   public void addArbitre(Arbitre newArbitre) {
      if (newArbitre == null)
         return;
      if (this.arbitre == null)
         this.arbitre = new java.util.HashSet<Arbitre>();
      if (!this.arbitre.contains(newArbitre))
      {
         this.arbitre.add(newArbitre);
         newArbitre.addMatch(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldArbitre */
   public void removeArbitre(Arbitre oldArbitre) {
      if (oldArbitre == null)
         return;
      if (this.arbitre != null)
         if (this.arbitre.contains(oldArbitre))
         {
            this.arbitre.remove(oldArbitre);
            oldArbitre.removeMatch(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArbitre() {
      if (arbitre != null)
      {
         Arbitre oldArbitre;
         for (java.util.Iterator iter = getIteratorArbitre(); iter.hasNext();)
         {
            oldArbitre = (Arbitre)iter.next();
            iter.remove();
            oldArbitre.removeMatch(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Ramasseur_de_balles> getRamasseur_de_balles() {
      if (ramasseur_de_balles == null)
         ramasseur_de_balles = new java.util.HashSet<Ramasseur_de_balles>();
      return ramasseur_de_balles;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRamasseur_de_balles() {
      if (ramasseur_de_balles == null)
         ramasseur_de_balles = new java.util.HashSet<Ramasseur_de_balles>();
      return ramasseur_de_balles.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRamasseur_de_balles */
   public void setRamasseur_de_balles(java.util.Collection<Ramasseur_de_balles> newRamasseur_de_balles) {
      removeAllRamasseur_de_balles();
      for (java.util.Iterator iter = newRamasseur_de_balles.iterator(); iter.hasNext();)
         addRamasseur_de_balles((Ramasseur_de_balles)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRamasseur_de_balles */
   public void addRamasseur_de_balles(Ramasseur_de_balles newRamasseur_de_balles) {
      if (newRamasseur_de_balles == null)
         return;
      if (this.ramasseur_de_balles == null)
         this.ramasseur_de_balles = new java.util.HashSet<Ramasseur_de_balles>();
      if (!this.ramasseur_de_balles.contains(newRamasseur_de_balles))
      {
         this.ramasseur_de_balles.add(newRamasseur_de_balles);
         newRamasseur_de_balles.addMatch(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRamasseur_de_balles */
   public void removeRamasseur_de_balles(Ramasseur_de_balles oldRamasseur_de_balles) {
      if (oldRamasseur_de_balles == null)
         return;
      if (this.ramasseur_de_balles != null)
         if (this.ramasseur_de_balles.contains(oldRamasseur_de_balles))
         {
            this.ramasseur_de_balles.remove(oldRamasseur_de_balles);
            oldRamasseur_de_balles.removeMatch(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRamasseur_de_balles() {
      if (ramasseur_de_balles != null)
      {
         Ramasseur_de_balles oldRamasseur_de_balles;
         for (java.util.Iterator iter = getIteratorRamasseur_de_balles(); iter.hasNext();)
         {
            oldRamasseur_de_balles = (Ramasseur_de_balles)iter.next();
            iter.remove();
            oldRamasseur_de_balles.removeMatch(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Equipe> getEquipe() {
      if (equipe == null)
         equipe = new java.util.HashSet<Equipe>();
      return equipe;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEquipe() {
      if (equipe == null)
         equipe = new java.util.HashSet<Equipe>();
      return equipe.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEquipe */
   public void setEquipe(java.util.Collection<Equipe> newEquipe) {
      removeAllEquipe();
      for (java.util.Iterator iter = newEquipe.iterator(); iter.hasNext();)
         addEquipe((Equipe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEquipe */
   public void addEquipe(Equipe newEquipe) {
      if (newEquipe == null)
         return;
      if (this.equipe == null)
         this.equipe = new java.util.HashSet<Equipe>();
      if (!this.equipe.contains(newEquipe))
      {
         this.equipe.add(newEquipe);
         newEquipe.addMatch(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEquipe */
   public void removeEquipe(Equipe oldEquipe) {
      if (oldEquipe == null)
         return;
      if (this.equipe != null)
         if (this.equipe.contains(oldEquipe))
         {
            this.equipe.remove(oldEquipe);
            oldEquipe.removeMatch(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEquipe() {
      if (equipe != null)
      {
         Equipe oldEquipe;
         for (java.util.Iterator iter = getIteratorEquipe(); iter.hasNext();)
         {
            oldEquipe = (Equipe)iter.next();
            iter.remove();
            oldEquipe.removeMatch(this);
         }
      }
   }

}