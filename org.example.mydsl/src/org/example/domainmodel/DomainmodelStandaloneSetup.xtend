/*
 * generated by Xtext 2.13.0
 */
package org.example.domainmodel


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DomainmodelStandaloneSetup extends DomainmodelStandaloneSetupGenerated {

	def static void doSetup() {
		new DomainmodelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
