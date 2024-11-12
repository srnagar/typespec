import { code, rename, replace, resolveFQN } from "@alloy-js/core";
import { resolveJavaFQN } from "@alloy-js/java";
import { CustomMethodBodySlot, CustomModelMethodsSlot, SetterProps } from "@typespec/emitter-framework/java";

// Renames

// Rename the Pet.java file to PetModel.java
// const petJavaFile = resolveFQN(
//   "TestProject.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java",
// );
// rename(petJavaFile, "PetModel_java");

// Rename the Pet class to PetModel
// const petModel = resolveFQN(
//   "TestProject.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java.Pet",
// );
// rename(petModel, "PetModel");

// Rename the name field to petName
const petName = resolveFQN(
  "TestProject.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java.Pet#name",
);
rename(petName, "petName");



// Replaces

// Add a validatePet method to the PetModel class
// const customModelMethodsSlot = CustomModelMethodsSlot.find({
//   name: "TestProject.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java.CustomModelMethodsSlot",
// });

// replace(customModelMethodsSlot, (props) => {
//   return code`
//     public void validatePet() {

//       if(this.name == null) {
//         throw new IllegalArgumentException("Name is required");
//       }

//       if(this.owner == null) {
//         throw new IllegalArgumentException("Pet must have an owner");
//       }
//     }  
//   `;
// });

const pName = resolveJavaFQN("Pet.java", "io.typespec.generated.models", "Pet");
rename(pName, "PetModel");

const personName = resolveJavaFQN("Person.java", "io.typespec.generated.models", "Person");
rename(personName, "PersonModel");



// Replace method body of the setter method for the name field in Pet class
// const customMethodBodySlot = CustomMethodBodySlot.find({
//   name: "TestProject.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java.setName.CustomMethodBodySlot",
// });

// replace(customMethodBodySlot, (props: SetterProps) => {
//   return code`
//     if(${props.type.name} == null) {
//        throw new IllegalArgumentException("is required");
//     }
       
//     this.${props.type.name} = ${props.type.name};
//     return this;
//   `;
// });
