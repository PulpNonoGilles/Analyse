/***********************************************************************
 * Module:  Place.java
 * Author:  p1200886
 * Purpose: Defines the Class Place
 ***********************************************************************/

import java.util.*;

/** @pdOid 9b37b3f6-52b4-4e30-8ae7-19f560f12953 */
public class Place {
   /** @pdOid e0c2f19c-a799-41c2-a0d5-e0b1304bbdb0 */
   private String codePlace;
   
   /** @pdRoleInfo migr=no name=Billet assc=concerne__ coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Billet billet;

}