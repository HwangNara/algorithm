select p.FirstName, p.LastName, a.City, a.State
from Person p
left join Address a using (PersonId);