import { code, mapJoin, replace } from "@alloy-js/core";
import { javaUtil } from "@alloy-js/java";
import { CustomModelMethodsSlot, ModelDeclarationProps } from "@typespec/emitter-framework/java";

// Renames

// Rename the Pet.java file to PetModel.java
// const petJavaFile = resolveFQN(
//   "my-project.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java",
// );
// rename(petJavaFile, "PetModel_java");

// Rename the Pet class to PetModel
// const petModel = resolveFQN("my-project.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java.Pet");
// rename(petModel, "PetModel");

// const personModel = resolveFQN("my-project.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Person_java.Person");
// rename(personModel, "PersonModel");

// Rename the name field to petName
// const petName = resolveFQN(
//   "my-project.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java.Pet#name",
// );
// rename(petName, "petName");

// Replaces

// Add a validate method to the Pet class
const petValidation = CustomModelMethodsSlot.find({
  artifactId: "my-project",
  javaFileName: "Pet.java",
  pkg: "io.typespec.generated.models",
  memberName: "CustomModelMethodsSlot",
});

replace(petValidation, (props: ModelDeclarationProps) => {
  console.log("Model name: ", props.type.name);
  return code`
    public void validate() {
      ${javaUtil.List}<String> errors = new ${javaUtil.ArrayList}<>();
      ${mapJoin(props.type.properties, (property, modelProperty) => {
        if (!modelProperty.optional) {
          console.log("Property name: ", property, modelProperty.optional);

          modelProperty.name = property + "Name";
          console.log("Updated property name: ", modelProperty.name);
          return code`
              if(${property} == null) {
                errors.add("${property} is required");
              }
            `;
        }
      })}
      if(!errors.isEmpty()) {
        throw new IllegalArgumentException(errors.toString());
      }
    }  

    @Override
    public int hashCode() {
        return Objects.hash(${(mapJoin(props.type.properties, (property, modelProperty) => property), ",")});
    }
  `;
});

// // Add a validate method to the Person class
// const personValidation = CustomModelMethodsSlot.find({
//   name: "my-project.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Person_java.CustomModelMethodsSlot",
// });

// replace(personValidation, (props: ModelDeclarationProps) => {
//   console.log("Model name: ", props.type.name);

//   mapJoin(props.type.properties, (property, modelProperty) => {
//     console.log("Property name: ", property, modelProperty.optional);
//   });

//   return code`
//     public void validate() {
//       ${javaUtil.List}<String> errors = new ${javaUtil.ArrayList}<>();
//       ${
//         mapJoin(props.type.properties, (property, modelProperty) => {
//           if(!modelProperty.optional) {
//             return code`
//               if(${property} == null) {
//                 errors.add("${property} is required");
//               }
//             `;
//           }
//         })
//       }

//       if(!errors.isEmpty()) {
//         throw new IllegalArgumentException(errors.toString());
//       }
//     }
//   `;
// });

const fooValidation = CustomModelMethodsSlot.find({
  artifactId: "my-project",
  javaFileName: "Foo.java",
  pkg: "io.typespec.generated.models",
  memberName: "CustomModelMethodsSlot",
});

replace(fooValidation, (props: ModelDeclarationProps) => {
  console.log("Model name: ", props.type.name);

  mapJoin(props.type.properties, (property, modelProperty) => {
    console.log("Property name: ", property, modelProperty.optional);
  });

  return code`
    public void validate() {
      ${javaUtil.List}<String> errors = new ${javaUtil.ArrayList}<>();
      ${mapJoin(props.type.properties, (property, modelProperty) => {
        if (!modelProperty.optional) {
          return code`
              if(${property} == null) {
                errors.add("${property} is required");
              }
            `;
        }
      })}

      if(!errors.isEmpty()) {
        throw new IllegalArgumentException(errors.toString());
      }
    }  
  `;
});

// const pName = resolveJavaFQN("my-project", "Pet.java", "io.typespec.generated.models", "Pet");
// rename(pName, "PetModel");

// const personName = resolveJavaFQN("Person.java", "io.typespec.generated.models", "Person");
// rename(personName, "PersonModel");

// Replace method body of the setter method for the name field in Pet class
// const customMethodBodySlot = CustomMethodBodySlot.find({
//   name: "my-project.io.io_typespec.io_typespec_generated.io_typespec_generated_models.Pet_java.setName.CustomMethodBodySlot",
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
