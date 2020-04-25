.class final Lag$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public final a:Lci;

.field public final b:Laj;

.field public final c:I


# direct methods
.method public constructor <init>(Lci;Laj;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lag$a;->a:Lci;

    iput-object p2, p0, Lag$a;->b:Laj;

    iput p3, p0, Lag$a;->c:I

    return-void
.end method
