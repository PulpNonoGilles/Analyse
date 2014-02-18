/***********************************************************************
 * Module:  Joueur.java
 * Author:  p1200886
 * Purpose: Defines the Class Joueur
 ***********************************************************************/

import java.util.*;

/** @pdOid 69c703b4-333d-460c-a00d-5ab84fcd285b */
public class Joueur {
   /** @pdOid 3b1e88e2-bb73-43af-a8ca-32c311b2f634 */
   private int numLicence;
   /** @pdOid 68861854-0693-4b8e-819b-ae4ce3a895f2 */
   private String nom;
   /** @pdOid b65460aa-0773-403b-8ecb-fa838fda60ce */
   private String prenom;
   /** @pdOid 9576683f-d620-4edb-aa93-37617f7c5080 */
   private java.util.Date date_de_naissance;
   /** @pdOid bfe95c3c-4c3b-4032-98f2-296e5c1eff28 */
   private boolean qualifie;
   
   /** @pdRoleInfo migr=no name=Court assc=reserve__ coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Court> court;
   /** @pdRoleInfo migr=no name=Equipe assc=__comporte coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public Equipe equipe;
   
   /** @pdOid ebca24b7-ecf4-45a1-a928-16640554d18b */
   public void estQualifie() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Court> getCourt() {
      if (court == null)
         court = new java.util.HashSet<Court>();
      return court;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCourt() {
      if (court == null)
         court = new java.util.HashSet<Court>();
      return court.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCourt */
   public void setCourt(java.util.Collection<Court> newCourt) {
      removeAllCourt();
      for (java.util.Iterator iter = newCourt.iterator(); iter.hasNext();)
         addCourt((Court)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCourt */
   public void addCourt(Court newCourt) {
      if (newCourt == null)
         return;
      if (this.court == null)
         this.court = new java.util.HashSet<Court>();
      if (!this.court.contains(newCourt))
      {
         this.court.add(newCourt);
         newCourt.addJoueur(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCourt */
   public void removeCourt(Court oldCourt) {
      if (oldCourt == null)
         return;
      if (this.court != null)
         if (this.court.contains(oldCourt))
         {
            this.court.remove(oldCourt);
            oldCourt.removeJoueur(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCourt() {
      if (court != null)
      {
         Court oldCourt;
         for (java.util.Iterator iter = getIteratorCourt(); iter.hasNext();)
         {
            oldCourt = (Court)iter.next();
            iter.remove();
            oldCourt.removeJoueur(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Equipe getEquipe() {
      return equipe;
   }
   
   /** @pdGenerated default parent setter
     * @param newEquipe */
   public void setEquipe(Equipe newEquipe) {
      if (this.equipe == null || !this.equipe.equals(newEquipe))
      {
         if (this.equipe != null)
         {
            Equipe oldEquipe = this.equipe;
            this.equipe = null;
            oldEquipe.removeJoueur(this);
         }
         if (newEquipe != null)
         {
            this.equipe = newEquipe;
            this.equipe.addJoueur(this);
         }
      }
   }

}