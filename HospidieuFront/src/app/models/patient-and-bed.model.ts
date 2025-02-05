export class PatientAndBed {
    idPatient !: number;
    name !: string;
    firstname !: string;
    birthDate !: Date;
    phone !: string;
    department ?: string;
    room ?: number;
    bed ?: number;
    idBed ?: number;
    userMail ?: string | null;
}