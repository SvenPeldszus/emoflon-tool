## Basic steps for creating the update site
1. Run the ant target ```clean``` to create a clean state
2. Build the update site:
  * Right-click *site.xml*, *Plug-In Tools->Build Site*
  * **IMPORTANT** It is **absolutely crucial** to reset the *site.xml* file after every build of the update site
    * When opening *site.xml*, the entries per category should 
       * look like this: "org.moflon.ide.feature (2.28.0.qualifier)"
       * NOT like this: "features/org.moflon.ide.feature_2.28.0.201702211758.jar"
	   * If this rule is not obeyed to, the generated features are not properly moved into the appropriate categories 
3. (optional) Sign the created JAR files (cf. *org.moflon.deployment.signing*)
4. Run the ant target ```createArchive``` to aggregate all necessary files in one ZIP archive 
5. Copy the generated archive (see */build*) to the target update site location and unpack it there.