# InvoiceManager
Invoice manager aplication template
Design the logic of automatic generation and payment of bills (invoices):
- The user chooses the tariff, payment period (month, year), automatic Design the logic of automatic generation and payment of bills (invoices):
- The user chooses the tariff, payment period (month, year), automatic/manual payment, enters bank card data (for automatic payment)
- For each user, depending on the selected payment period, on the corresponding day of the month/year, an invoice is generated according to the selected tariff
- With automatic payment, an attempt is made to debit the card through the payment service
- If automatic payment fails, several retries are made with an interval of a day
- If the permissible number of unpaid bills is exceeded within the specified time, the service is blocked
- Interaction with the application (entry point) - HTTP API; all operations, including those that occur according to the schedule, are considered as coming from the outside as API requests
