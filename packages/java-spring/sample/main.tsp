import "@typespec/http";
using TypeSpec.Http;
@service
@useAuth(BearerAuth)
namespace DemoService {

  @error
  model CustomError {
    @statusCode _: 400;
    code: int32;
    message: string;
  }

  @route("/people")
  namespace People {
    model Person {
      id: int32;
      firstName: string;
      lastName: string;
      pets: Pets.Pet[];
      address: Address;
    }

    model Address {
      unit: string;
      street: string;
      city: string;
      state: string;
      postalCode: string;
      country: string;
    }

    @get op getPerson(@path id: int32): {
      @body body: Person;
      @header testHeader: string;
    } | NotFoundResponse | CustomError;
    @get op listPeople(): Person[] | CustomError;
    @post op createPerson(@body person: Person): CreatedResponse | CustomError;
  }

  @route("/pets")
  namespace Pets {
    model Pet {
      name: string | int32;
      owner?: People.Person;
    }

    model PetStore {
      address: string;
      pets: Pets.Pet[];
    }

    op listPets(): {
     @body body: Pet[];
     @header x: string;
    } | CustomError;

    @get @route("/stores")
    op listPetStores(): {
      @body body: PetStore[];
    };
  }
}
