.class final Liq$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Liq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Lin$b;

.field b:Lim;


# direct methods
.method constructor <init>(Lio;Lin$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lis;->a(Ljava/lang/Object;)Lim;

    move-result-object p1

    iput-object p1, p0, Liq$a;->b:Lim;

    iput-object p2, p0, Liq$a;->a:Lin$b;

    return-void
.end method


# virtual methods
.method final a(Lip;Lin$a;)V
    .locals 2

    invoke-static {p2}, Liq;->b(Lin$a;)Lin$b;

    move-result-object v0

    iget-object v1, p0, Liq$a;->a:Lin$b;

    invoke-static {v1, v0}, Liq;->a(Lin$b;Lin$b;)Lin$b;

    move-result-object v1

    iput-object v1, p0, Liq$a;->a:Lin$b;

    iget-object v1, p0, Liq$a;->b:Lim;

    invoke-interface {v1, p1, p2}, Lim;->a(Lip;Lin$a;)V

    iput-object v0, p0, Liq$a;->a:Lin$b;

    return-void
.end method
