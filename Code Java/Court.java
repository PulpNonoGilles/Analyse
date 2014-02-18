/***********************************************************************
 * Module:  Court.java
 * Author:  p1200886
 * Purpose: Defines the Class Court
 ***********************************************************************/

import java.util.*;

/** @pdOid ac32854f-ed5b-47e1-8574-d10d36a33f2d */
public class Court {
   /** @pdOid f1723778-e5e4-41ec-864f-250411e56ac1 */
   private int numCourt;
   
   /** @pdRoleInfo migr=no name=Match assc=__se_deroule coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Match> match;
   /** @pdRoleInfo migr=no name=Joueur assc=reserve__ coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Joueur> joueur;
   
   /** @pdOid 5ec5247b-31e0-455a-8468-f3c2d9d2ead6 */
   public void reserver() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getMatch() {
      if (match == null)
         match = new java.util.HashSet<Match>();
      return match;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMatch() {
      if (match == null)
         match = new java.util.HashSet<Match>();
      return match.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMatch */
   public void setMatch(java.util.Collection<Match> newMatch) {
      removeAllMatch();
      for (java.util.Iterator iter = newMatch.iterator(); iter.hasNext();)
         addMatch((Match)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatch */
   public void addMatch(Match newMatch) {
      if (newMatch == null)
         return;
      if (this.match == null)
         this.match = new java.util.HashSet<Match>();
      if (!this.match.contains(newMatch))
      {
         this.match.add(newMatch);
         newMatch.setCourt(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeMatch(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.match != null)
         if (this.match.contains(oldMatch))
         {
            this.match.remove(oldMatch);
            oldMatch.setCourt((Court)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMatch() {
      if (match != null)
      {
         Match oldMatch;
         for (java.util.Iterator iter = getIteratorMatch(); iter.hasNext();)
         {
            oldMatch = (Match)iter.next();
            iter.remove();
            oldMatch.setCourt((Court)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Joueur> getJoueur() {
      if (joueur == null)
         joueur = new java.util.HashSet<Joueur>();
      return joueur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJoueur() {
      if (joueur == null)
         joueur = new java.util.HashSet<Joueur>();
      return joueur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJoueur */
   public void setJoueur(java.util.Collection<Joueur> newJoueur) {
      removeAllJoueur();
      for (java.util.Iterator iter = newJoueur.iterator(); iter.hasNext();)
         addJoueur((Joueur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJoueur */
   public void addJoueur(Joueur newJoueur) {
      if (newJoueur == null)
         return;
      if (this.joueur == null)
         this.joueur = new java.util.HashSet<Joueur>();
      if (!this.joueur.contains(newJoueur))
      {
         this.joueur.add(newJoueur);
         newJoueur.addCourt(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldJoueur */
   public void removeJoueur(Joueur oldJoueur) {
      if (oldJoueur == null)
         return;
      if (this.joueur != null)
         if (this.joueur.contains(oldJoueur))
         {
            this.joueur.remove(oldJoueur);
            oldJoueur.removeCourt(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJoueur() {
      if (joueur != null)
      {
         Joueur oldJoueur;
         for (java.util.Iterator iter = getIteratorJoueur(); iter.hasNext();)
         {
            oldJoueur = (Joueur)iter.next();
            iter.remove();
            oldJoueur.removeCourt(this);
         }
      }
   }

}