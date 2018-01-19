/*
 * generated by Xtext 2.13.0
 */
package org.example.domainmodel.validation

import org.eclipse.xtext.validation.Check
import org.example.domainmodel.domainmodel.DomainmodelPackage
import org.example.domainmodel.domainmodel.Entity
import org.example.domainmodel.domainmodel.Feature

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DomainmodelValidator extends AbstractDomainmodelValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					DomainmodelPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
    
    @Check
    def void 检验子类无父类重名性状(Feature f) {
        var 父类 = (f.eContainer as Entity).superType
        while (父类 !== null) {
            for (其他 : 父类.features) {
                if (f.name == 其他.name) {
                    error("子类性状不能与父类中性状重名",
                        DomainmodelPackage.Literals.FEATURE__NAME)
                    return
                }
            }
            父类 = 父类.getSuperType();
        }
    }
	
}
