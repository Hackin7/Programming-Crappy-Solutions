.class public abstract Ljc;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljc$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lip;)Ljc;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lip;",
            ":",
            "Ljb;",
            ">(TT;)",
            "Ljc;"
        }
    .end annotation

    new-instance v0, Ljd;

    move-object v1, p0

    check-cast v1, Ljb;

    invoke-interface {v1}, Ljb;->a()Lja;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljd;-><init>(Lip;Lja;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract a(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
