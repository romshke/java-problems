import java.util.*;

class TransactionExample {

    /**
     * Calculates the general sum of canceled transactions for all non empty accounts in the list
     */
    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        // write your code here
        return accounts.stream()
                .filter(account -> account.getBalance() > 0)
                .flatMap(account -> account.getTransactions().stream()
                        .filter(transaction -> transaction.getState() == State.CANCELED))
                .mapToLong(Transaction::getSum)
                .sum();
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfAccounts = Integer.parseInt(scanner.nextLine());
        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < numberOfAccounts; i++) {
            String[] accDesc = scanner.nextLine().split(" ");
            String number = accDesc[0];
            Long balance = Long.parseLong(accDesc[1]);

            int numberOfTransByAccount = Integer.parseInt(scanner.nextLine());
            List<Transaction> trans = new ArrayList<>();

            for (int j = 0; j < numberOfTransByAccount; j++) {
                String[] transDesc = scanner.nextLine().split(" ");
                String uuid = transDesc[0];
                State state = convertStringToState(transDesc[1]);
                Long sum = Long.parseLong(transDesc[2]);
                trans.add(new Transaction(uuid, state, sum));
            }

            accounts.add(new Account(number, balance, trans));
        }

        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(accounts));
    }

    private static State convertStringToState(String state) {
        switch (state) {
            case "c": return State.CANCELED;
            case "f": return State.FINISHED;
            case "p": return State.PROCESSING;
            default: throw new IllegalArgumentException("Unknown account state");
        }
    }

    enum State {
        FINISHED, CANCELED, PROCESSING
    }

    static class Transaction {

        private final String uuid;
        private final State state;
        private final Long sum;

        public Transaction(String uuid, State state, Long sum) {
            this.uuid = uuid;
            this.state = state;
            this.sum = sum;
        }

        public State getState() {
            return state;
        }

        public Long getSum() {
            return sum;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "uuid='" + uuid + '\'' +
                    ", state=" + state +
                    ", sum=" + sum +
                    '}';
        }
    }

    static class Account {

        private final String number;
        private final Long balance;
        private final List<Transaction> transactions;

        public Account(String number, Long balance, List<Transaction> transactions) {
            this.number = number;
            this.balance = balance;
            this.transactions = transactions;
        }

        public Long getBalance() {
            return balance;
        }

        public List<Transaction> getTransactions() {
            return transactions;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "number='" + number + '\'' +
                    ", balance=" + balance +
                    ", transactions=" + transactions +
                    '}';
        }
    }


//    public static void main(String[] args) {
//        List<Transaction> t1 = Arrays.asList(
//                new Transaction("t1", State.CANCELED, 100L),
//                new Transaction("t2", State.FINISHED, 200L),
//                new Transaction("t3", State.CANCELED, 300L)
//        );
//        List<Transaction> t2 = Arrays.asList(
//                new Transaction("t4", State.FINISHED, 400L),
//                new Transaction("t5", State.CANCELED, 500L)
//        );
//        List<Transaction> t3 = Arrays.asList(
//                new Transaction("t6", State.CANCELED, 600L)
//        );
//
//        Account acc1 = new Account("111", 1000L, t1); // не пустой аккаунт
//        Account acc2 = new Account("222", 0L, t2);    // пустой аккаунт, запишем его для проверки фильтра
//        Account acc3 = new Account("333", 50L, t3);   // не пустой аккаунт
//
//        List<Account> accounts = Arrays.asList(acc1, acc2, acc3);
//
//        long result = calcSumOfCanceledTransOnNonEmptyAccounts(accounts);
//        // Ожидаемая сумма: acc1: t1(100) + t3(300) = 400, acc3: t6(600), всего 1000.
//        System.out.println(result); // Должно вывести 1000
//    }
}